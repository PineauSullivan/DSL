/*
 * generated by Xtext 2.10.0
 */
grammar InternalAgenda;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.univ.nantes.master.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.univ.nantes.master.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.univ.nantes.master.dsl.services.AgendaGrammarAccess;

}

@parser::members {

 	private AgendaGrammarAccess grammarAccess;

    public InternalAgendaParser(TokenStream input, AgendaGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "AGENDA";
   	}

   	@Override
   	protected AgendaGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleAGENDA
entryRuleAGENDA returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAGENDARule()); }
	iv_ruleAGENDA=ruleAGENDA
	{ $current=$iv_ruleAGENDA.current; }
	EOF;

// Rule AGENDA
ruleAGENDA returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAGENDAAccess().getPreamPREAMBULEParserRuleCall_0_0());
				}
				lv_pream_0_0=rulePREAMBULE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAGENDARule());
					}
					set(
						$current,
						"pream",
						lv_pream_0_0,
						"org.xtext.univ.nantes.master.dsl.Agenda.PREAMBULE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getAGENDAAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAGENDAAccess().getContenuCONTENUParserRuleCall_2_0());
				}
				lv_contenu_2_0=ruleCONTENU
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAGENDARule());
					}
					set(
						$current,
						"contenu",
						lv_contenu_2_0,
						"org.xtext.univ.nantes.master.dsl.Agenda.CONTENU");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getAGENDAAccess().getRightParenthesisKeyword_3());
		}
	)?
;

// Entry rule entryRulePREAMBULE
entryRulePREAMBULE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPREAMBULERule()); }
	iv_rulePREAMBULE=rulePREAMBULE
	{ $current=$iv_rulePREAMBULE.current; }
	EOF;

// Rule PREAMBULE
rulePREAMBULE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Agenda'
		{
			newLeafNode(otherlv_0, grammarAccess.getPREAMBULEAccess().getAgendaKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPREAMBULEAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPREAMBULERule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCONTENU
entryRuleCONTENU returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCONTENURule()); }
	iv_ruleCONTENU=ruleCONTENU
	{ $current=$iv_ruleCONTENU.current; }
	EOF;

// Rule CONTENU
ruleCONTENU returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCONTENUAccess().getDescDESCRIPTIONParserRuleCall_0_0());
				}
				lv_desc_0_0=ruleDESCRIPTION
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCONTENURule());
					}
					set(
						$current,
						"desc",
						lv_desc_0_0,
						"org.xtext.univ.nantes.master.dsl.Agenda.DESCRIPTION");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCONTENUAccess().getEvtaEVENTS_OR_TASKSParserRuleCall_1_0());
				}
				lv_evta_1_0=ruleEVENTS_OR_TASKS
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCONTENURule());
					}
					add(
						$current,
						"evta",
						lv_evta_1_0,
						"org.xtext.univ.nantes.master.dsl.Agenda.EVENTS_OR_TASKS");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleDESCRIPTION
entryRuleDESCRIPTION returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDESCRIPTIONRule()); }
	iv_ruleDESCRIPTION=ruleDESCRIPTION
	{ $current=$iv_ruleDESCRIPTION.current; }
	EOF;

// Rule DESCRIPTION
ruleDESCRIPTION returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Description'
		{
			newLeafNode(otherlv_0, grammarAccess.getDESCRIPTIONAccess().getDescriptionKeyword_0());
		}
		(
			(
				lv_description_1_0=RULE_STRING
				{
					newLeafNode(lv_description_1_0, grammarAccess.getDESCRIPTIONAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDESCRIPTIONRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleEVENTS_OR_TASKS
entryRuleEVENTS_OR_TASKS returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEVENTS_OR_TASKSRule()); }
	iv_ruleEVENTS_OR_TASKS=ruleEVENTS_OR_TASKS
	{ $current=$iv_ruleEVENTS_OR_TASKS.current; }
	EOF;

// Rule EVENTS_OR_TASKS
ruleEVENTS_OR_TASKS returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEVENTS_OR_TASKSAccess().getEvent_or_taskEVENTParserRuleCall_0_0());
				}
				lv_event_or_task_0_0=ruleEVENT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEVENTS_OR_TASKSRule());
					}
					add(
						$current,
						"event_or_task",
						lv_event_or_task_0_0,
						"org.xtext.univ.nantes.master.dsl.Agenda.EVENT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getEVENTS_OR_TASKSAccess().getTASKParserRuleCall_1());
		}
		this_TASK_1=ruleTASK
		{
			$current = $this_TASK_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEVENT
entryRuleEVENT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEVENTRule()); }
	iv_ruleEVENT=ruleEVENT
	{ $current=$iv_ruleEVENT.current; }
	EOF;

// Rule EVENT
ruleEVENT returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Event'
		{
			newLeafNode(otherlv_0, grammarAccess.getEVENTAccess().getEventKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEVENTAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEVENTRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEVENTAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEVENTAccess().getContent_eventCONTENT_EVENTParserRuleCall_3_0());
				}
				lv_content_event_3_0=ruleCONTENT_EVENT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEVENTRule());
					}
					set(
						$current,
						"content_event",
						lv_content_event_3_0,
						"org.xtext.univ.nantes.master.dsl.Agenda.CONTENT_EVENT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getEVENTAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleCONTENT_EVENT
entryRuleCONTENT_EVENT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCONTENT_EVENTRule()); }
	iv_ruleCONTENT_EVENT=ruleCONTENT_EVENT
	{ $current=$iv_ruleCONTENT_EVENT.current; }
	EOF;

// Rule CONTENT_EVENT
ruleCONTENT_EVENT returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Place'
		{
			newLeafNode(otherlv_0, grammarAccess.getCONTENT_EVENTAccess().getPlaceKeyword_0());
		}
		(
			(
				lv_place_1_0=RULE_STRING
				{
					newLeafNode(lv_place_1_0, grammarAccess.getCONTENT_EVENTAccess().getPlaceSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCONTENT_EVENTRule());
					}
					setWithLastConsumed(
						$current,
						"place",
						lv_place_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='Date'
		{
			newLeafNode(otherlv_2, grammarAccess.getCONTENT_EVENTAccess().getDateKeyword_2());
		}
		(
			(
				lv_data_3_0=RULE_STRING
				{
					newLeafNode(lv_data_3_0, grammarAccess.getCONTENT_EVENTAccess().getDataSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCONTENT_EVENTRule());
					}
					setWithLastConsumed(
						$current,
						"data",
						lv_data_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='Start'
		{
			newLeafNode(otherlv_4, grammarAccess.getCONTENT_EVENTAccess().getStartKeyword_4());
		}
		(
			(
				lv_start_5_0=RULE_STRING
				{
					newLeafNode(lv_start_5_0, grammarAccess.getCONTENT_EVENTAccess().getStartSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCONTENT_EVENTRule());
					}
					setWithLastConsumed(
						$current,
						"start",
						lv_start_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6='End'
		{
			newLeafNode(otherlv_6, grammarAccess.getCONTENT_EVENTAccess().getEndKeyword_6());
		}
		(
			(
				lv_end_7_0=RULE_STRING
				{
					newLeafNode(lv_end_7_0, grammarAccess.getCONTENT_EVENTAccess().getEndSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCONTENT_EVENTRule());
					}
					setWithLastConsumed(
						$current,
						"end",
						lv_end_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleTASK
entryRuleTASK returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTASKRule()); }
	iv_ruleTASK=ruleTASK
	{ $current=$iv_ruleTASK.current; }
	EOF;

// Rule TASK
ruleTASK returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Task'
		{
			newLeafNode(otherlv_0, grammarAccess.getTASKAccess().getTaskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTASKAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTASKRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='relatesTo'
			{
				newLeafNode(otherlv_2, grammarAccess.getTASKAccess().getRelatesToKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTASKRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getTASKAccess().getNameEventEVENTCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getTASKAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_5='deadline'
		{
			newLeafNode(otherlv_5, grammarAccess.getTASKAccess().getDeadlineKeyword_4());
		}
		(
			(
				lv_deadline_6_0=RULE_STRING
				{
					newLeafNode(lv_deadline_6_0, grammarAccess.getTASKAccess().getDeadlineSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTASKRule());
					}
					setWithLastConsumed(
						$current,
						"deadline",
						lv_deadline_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getTASKAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
