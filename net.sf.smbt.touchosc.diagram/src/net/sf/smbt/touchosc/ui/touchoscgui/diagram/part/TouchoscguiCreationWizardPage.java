package net.sf.smbt.touchosc.ui.touchoscgui.diagram.part;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class TouchoscguiCreationWizardPage extends WizardNewFileCreationPage {

	/**
	 * @generated
	 */
	private final String fileExtension;

	public String orientation;
	public String mode;

	/**
	 * @generated
	 */
	public TouchoscguiCreationWizardPage(String pageName,
			IStructuredSelection selection, String fileExtension) {
		super(pageName, selection);
		this.fileExtension = fileExtension;
	}

	/**
	 * Override to create files with this extension.
	 * 
	 * @generated
	 */
	protected String getExtension() {
		return fileExtension;
	}

	/**
	 * @generated
	 */
	public URI getURI() {
		return URI.createPlatformResourceURI(getFilePath().toString(), false);
	}

	/**
	 * @generated
	 */
	protected IPath getFilePath() {
		IPath path = getContainerFullPath();
		if (path == null) {
			path = new Path(""); //$NON-NLS-1$
		}
		String fileName = getFileName();
		if (fileName != null) {
			path = path.append(fileName);
		}
		return path;
	}

	/**
	 * @generated NOT
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);
		setFileName(TouchoscguiDiagramEditorUtil.getUniqueFileName(
				getContainerFullPath(), getFileName(), getExtension()));

		Group layoutSettingsGroup = new Group((Composite) getControl(),
				SWT.NONE);
		layoutSettingsGroup.setText("Presentation Settings :");
		layoutSettingsGroup.setLayout(GridLayoutFactory.fillDefaults()
				.numColumns(2).create());
		layoutSettingsGroup.setLayoutData(GridDataFactory.fillDefaults()
				.grab(true, false).create());

		setOrientation(layoutSettingsGroup);
		setMode(layoutSettingsGroup);

		setPageComplete(validatePage());
	}

	private void setOrientation(Composite parent) {
		Label orientationLabel = new Label(parent, SWT.NONE);
		orientationLabel.setText("Orientation :");
		orientationLabel.setLayoutData(GridDataFactory.fillDefaults()
				.grab(false, false).minSize(100, SWT.DEFAULT).create());

		Combo orientationCombo = new Combo(parent, SWT.READ_ONLY);
		orientationCombo.setLayout(GridLayoutFactory.fillDefaults().create());
		orientationCombo.setLayoutData(GridDataFactory.fillDefaults()
				.grab(true, false).create());
		ComboViewer orientationViewer = new ComboViewer(orientationCombo);
		orientationViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof String) {
					return (String) element;
				}
				return super.getText(element);
			}
		});
		orientationViewer.setContentProvider(new ArrayContentProvider());
		String[] orientations = new String[] { "vertical", "horizontal" };
		orientationViewer.setInput(orientations);
		orientationViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						orientation = (String) ((StructuredSelection) event
								.getSelection()).getFirstElement();
					}
				});
		orientationViewer
				.setSelection(new StructuredSelection(orientations[0]));
	}

	private void setMode(Composite parent) {
		Label modeLabel = new Label(parent, SWT.NONE);
		modeLabel.setText("Mode :");
		modeLabel.setLayoutData(GridDataFactory.fillDefaults()
				.grab(false, false).minSize(100, SWT.DEFAULT).create());

		Combo modeCombo = new Combo(parent, SWT.READ_ONLY);
		modeCombo.setLayout(GridLayoutFactory.fillDefaults().create());
		modeCombo.setLayoutData(GridDataFactory.fillDefaults()
				.grab(true, false).create());
		ComboViewer modeViewer = new ComboViewer(modeCombo);
		modeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof String) {
					return (String) element;
				}
				return super.getText(element);
			}
		});
		modeViewer.setContentProvider(new ArrayContentProvider());
		String[] modes = new String[] { "iphone", "ipad" };
		modeViewer.setInput(modes);
		modeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				mode = (String) ((StructuredSelection) event.getSelection())
						.getFirstElement();
			}
		});
		modeViewer.setSelection(new StructuredSelection(modes[0]));
	}

	/**
	 * @generated
	 */
	protected boolean validatePage() {
		if (!super.validatePage()) {
			return false;
		}
		String extension = getExtension();
		if (extension != null
				&& !getFilePath().toString().endsWith("." + extension)) {
			setErrorMessage(NLS.bind(
					Messages.TouchoscguiCreationWizardPageExtensionError,
					extension));
			return false;
		}
		return true;
	}
}
