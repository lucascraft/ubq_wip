lexer grammar InternalNetConf;
@header {
package net.sf.smbt.comm.script.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '*' ;
T13 : 'usb://' ;
T14 : 'tcp://' ;
T15 : 'udp://' ;
T16 : 'http://' ;
T17 : 'bt://' ;
T18 : 'xbee://' ;
T19 : 'ubq://' ;
T20 : 'UNICAST' ;
T21 : 'MULTICAST' ;
T22 : 'BROADCAST' ;
T23 : 'PICK_N_RUSH' ;
T24 : 'OLDEST_MOST_URGENT' ;
T25 : 'NEWEST_MOST_URGENT' ;
T26 : 'PREDICATE' ;
T27 : 'ROUN_ROBIN' ;
T28 : 'TIME_RANGE_INCLUSIVE' ;
T29 : 'TIME_RANGE_EXCLUSIVE' ;
T30 : 'MAX' ;
T31 : 'VERY_FAST' ;
T32 : 'FAST' ;
T33 : 'AVERAGE' ;
T34 : 'SLOW' ;
T35 : 'VERY_SLOW' ;
T36 : 'MIN' ;
T37 : 'HIGHER' ;
T38 : 'HIGH' ;
T39 : 'MEDIUM' ;
T40 : 'LOW' ;
T41 : 'LOWEST' ;
T42 : 'import' ;
T43 : ';' ;
T44 : 'port' ;
T45 : ':' ;
T46 : 'as' ;
T47 : 'at' ;
T48 : 'accept' ;
T49 : ',' ;
T50 : 'forward' ;
T51 : 'in' ;
T52 : 'decoder' ;
T53 : 'interpreter' ;
T54 : 'listener' ;
T55 : 'scope' ;
T56 : '{' ;
T57 : '}' ;
T58 : 'bind' ;
T59 : 'to' ;
T60 : '=>' ;
T61 : '<=' ;
T62 : 'with' ;
T63 : '.*' ;
T64 : '.' ;
T65 : 'engine' ;
T66 : 'speed' ;
T67 : 'ttl' ;
T68 : 'strategy' ;
T69 : 'threshold' ;
T70 : 'priority' ;
T71 : 'filter' ;
T72 : 'client' ;

// $ANTLR src "../net.sf.smbt.comm.script.config.ui/src-gen/net/sf/smbt/comm/script/ui/contentassist/antlr/internal/InternalNetConf.g" 5391
RULE_IPBYTEEXPR : ('0'..'9'|'1'..'9' '0'..'9'|'1' '0'..'9' '0'..'9'|'2' '0'..'5' '0'..'5');

// $ANTLR src "../net.sf.smbt.comm.script.config.ui/src-gen/net/sf/smbt/comm/script/ui/contentassist/antlr/internal/InternalNetConf.g" 5393
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.smbt.comm.script.config.ui/src-gen/net/sf/smbt/comm/script/ui/contentassist/antlr/internal/InternalNetConf.g" 5395
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.smbt.comm.script.config.ui/src-gen/net/sf/smbt/comm/script/ui/contentassist/antlr/internal/InternalNetConf.g" 5397
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.smbt.comm.script.config.ui/src-gen/net/sf/smbt/comm/script/ui/contentassist/antlr/internal/InternalNetConf.g" 5399
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.smbt.comm.script.config.ui/src-gen/net/sf/smbt/comm/script/ui/contentassist/antlr/internal/InternalNetConf.g" 5401
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.smbt.comm.script.config.ui/src-gen/net/sf/smbt/comm/script/ui/contentassist/antlr/internal/InternalNetConf.g" 5403
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.smbt.comm.script.config.ui/src-gen/net/sf/smbt/comm/script/ui/contentassist/antlr/internal/InternalNetConf.g" 5405
RULE_ANY_OTHER : .;


