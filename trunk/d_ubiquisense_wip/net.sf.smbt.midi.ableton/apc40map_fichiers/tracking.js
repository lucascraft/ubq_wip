function toggleGoogleStats( box_id )
{
	stats_box_table = document.getElementById( box_id );

	if ( !stats_box_table )
	{
		return;
	}

	if ( stats_box_table.style.display == 'block' )
	{
		stats_box_table.style.display = 'none';
	}
	else
	{
		stats_box_table.style.display = 'block';
	}
}

function copyStatsToClipboard( link_object, stats_id )
{
	//	Hide the copy image link
	link_object.style.display = 'none';

	//	Do the copy
	copyElementToClipboard( stats_id )

	//	Show the link
	link_object.style.display = 'block';

	alert('Copied to clipboard');
}