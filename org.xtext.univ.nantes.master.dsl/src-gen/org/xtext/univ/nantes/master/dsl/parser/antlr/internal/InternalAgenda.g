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
    	return "MODEL";
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

// Entry rule entryRuleMODEL
entryRuleMODEL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMODELRule()); }
	iv_ruleMODEL=ruleMODEL
	{ $current=$iv_ruleMODEL.current; }
	EOF;

// Rule MODEL
ruleMODEL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMODELAccess().getEntiteTYPEParserRuleCall_0());
			}
			lv_entite_0_0=ruleTYPE
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMODELRule());
				}
				set(
					$current,
					"entite",
					lv_entite_0_0,
					"org.xtext.univ.nantes.master.dsl.Agenda.TYPE");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleTYPE
entryRuleTYPE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTYPERule()); }
	iv_ruleTYPE=ruleTYPE
	{ $current=$iv_ruleTYPE.current; }
	EOF;

// Rule TYPE
ruleTYPE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getTYPEAccess().getAGENDAParserRuleCall());
	}
	this_AGENDA_0=ruleAGENDA
	{
		$current = $this_AGENDA_0.current;
		afterParserOrEnumRuleCall();
	}
;

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
		otherlv_0='Agenda'
		{
			newLeafNode(otherlv_0, grammarAccess.getAGENDAAccess().getAgendaKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAGENDAAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAGENDARule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getAGENDAAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='Description'
		{
			newLeafNode(otherlv_3, grammarAccess.getAGENDAAccess().getDescriptionKeyword_3());
		}
		(
			(
				lv_description_4_0=RULE_STRING
				{
					newLeafNode(lv_description_4_0, grammarAccess.getAGENDAAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAGENDARule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAGENDAAccess().getEventEVENTParserRuleCall_5_0());
				}
				lv_event_5_0=ruleEVENT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAGENDARule());
					}
					add(
						$current,
						"event",
						lv_event_5_0,
						"org.xtext.univ.nantes.master.dsl.Agenda.EVENT");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getAGENDAAccess().getTaskTASKParserRuleCall_6_0());
				}
				lv_task_6_0=ruleTASK
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAGENDARule());
					}
					add(
						$current,
						"task",
						lv_task_6_0,
						"org.xtext.univ.nantes.master.dsl.Agenda.TASK");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getAGENDAAccess().getRightParenthesisKeyword_7());
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
		otherlv_3='Place'
		{
			newLeafNode(otherlv_3, grammarAccess.getEVENTAccess().getPlaceKeyword_3());
		}
		(
			(
				lv_place_4_0=RULE_STRING
				{
					newLeafNode(lv_place_4_0, grammarAccess.getEVENTAccess().getPlaceSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEVENTRule());
					}
					setWithLastConsumed(
						$current,
						"place",
						lv_place_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='Date'
		{
			newLeafNode(otherlv_5, grammarAccess.getEVENTAccess().getDateKeyword_5());
		}
		(
			(
				lv_date_6_0=RULE_STRING
				{
					newLeafNode(lv_date_6_0, grammarAccess.getEVENTAccess().getDateSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEVENTRule());
					}
					setWithLastConsumed(
						$current,
						"date",
						lv_date_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='Start'
		{
			newLeafNode(otherlv_7, grammarAccess.getEVENTAccess().getStartKeyword_7());
		}
		(
			(
				lv_start_8_0=RULE_STRING
				{
					newLeafNode(lv_start_8_0, grammarAccess.getEVENTAccess().getStartSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEVENTRule());
					}
					setWithLastConsumed(
						$current,
						"start",
						lv_start_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9='End'
		{
			newLeafNode(otherlv_9, grammarAccess.getEVENTAccess().getEndKeyword_9());
		}
		(
			(
				lv_end_10_0=RULE_STRING
				{
					newLeafNode(lv_end_10_0, grammarAccess.getEVENTAccess().getEndSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEVENTRule());
					}
					setWithLastConsumed(
						$current,
						"end",
						lv_end_10_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getEVENTAccess().getRightCurlyBracketKeyword_11());
		}
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
						newLeafNode(otherlv_3, grammarAccess.getTASKAccess().getRefEventEVENTCrossReference_2_1_0());
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
