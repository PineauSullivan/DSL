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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAgendaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'Agenda'", "'Description'", "'Event'", "'{'", "'}'", "'Place'", "'Date'", "'Start'", "'End'", "'Task'", "'relatesTo'", "'deadline'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAgendaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAgendaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAgendaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAgenda.g"; }



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




    // $ANTLR start "entryRuleAGENDA"
    // InternalAgenda.g:64:1: entryRuleAGENDA returns [EObject current=null] : iv_ruleAGENDA= ruleAGENDA EOF ;
    public final EObject entryRuleAGENDA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAGENDA = null;


        try {
            // InternalAgenda.g:64:47: (iv_ruleAGENDA= ruleAGENDA EOF )
            // InternalAgenda.g:65:2: iv_ruleAGENDA= ruleAGENDA EOF
            {
             newCompositeNode(grammarAccess.getAGENDARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAGENDA=ruleAGENDA();

            state._fsp--;

             current =iv_ruleAGENDA; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAGENDA"


    // $ANTLR start "ruleAGENDA"
    // InternalAgenda.g:71:1: ruleAGENDA returns [EObject current=null] : ( ( (lv_pream_0_0= rulePREAMBULE ) ) otherlv_1= '(' ( (lv_contenu_2_0= ruleCONTENU ) ) otherlv_3= ')' )? ;
    public final EObject ruleAGENDA() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pream_0_0 = null;

        EObject lv_contenu_2_0 = null;



        	enterRule();

        try {
            // InternalAgenda.g:77:2: ( ( ( (lv_pream_0_0= rulePREAMBULE ) ) otherlv_1= '(' ( (lv_contenu_2_0= ruleCONTENU ) ) otherlv_3= ')' )? )
            // InternalAgenda.g:78:2: ( ( (lv_pream_0_0= rulePREAMBULE ) ) otherlv_1= '(' ( (lv_contenu_2_0= ruleCONTENU ) ) otherlv_3= ')' )?
            {
            // InternalAgenda.g:78:2: ( ( (lv_pream_0_0= rulePREAMBULE ) ) otherlv_1= '(' ( (lv_contenu_2_0= ruleCONTENU ) ) otherlv_3= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAgenda.g:79:3: ( (lv_pream_0_0= rulePREAMBULE ) ) otherlv_1= '(' ( (lv_contenu_2_0= ruleCONTENU ) ) otherlv_3= ')'
                    {
                    // InternalAgenda.g:79:3: ( (lv_pream_0_0= rulePREAMBULE ) )
                    // InternalAgenda.g:80:4: (lv_pream_0_0= rulePREAMBULE )
                    {
                    // InternalAgenda.g:80:4: (lv_pream_0_0= rulePREAMBULE )
                    // InternalAgenda.g:81:5: lv_pream_0_0= rulePREAMBULE
                    {

                    					newCompositeNode(grammarAccess.getAGENDAAccess().getPreamPREAMBULEParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_pream_0_0=rulePREAMBULE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAGENDARule());
                    					}
                    					set(
                    						current,
                    						"pream",
                    						lv_pream_0_0,
                    						"org.xtext.univ.nantes.master.dsl.Agenda.PREAMBULE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_4); 

                    			newLeafNode(otherlv_1, grammarAccess.getAGENDAAccess().getLeftParenthesisKeyword_1());
                    		
                    // InternalAgenda.g:102:3: ( (lv_contenu_2_0= ruleCONTENU ) )
                    // InternalAgenda.g:103:4: (lv_contenu_2_0= ruleCONTENU )
                    {
                    // InternalAgenda.g:103:4: (lv_contenu_2_0= ruleCONTENU )
                    // InternalAgenda.g:104:5: lv_contenu_2_0= ruleCONTENU
                    {

                    					newCompositeNode(grammarAccess.getAGENDAAccess().getContenuCONTENUParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_contenu_2_0=ruleCONTENU();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAGENDARule());
                    					}
                    					set(
                    						current,
                    						"contenu",
                    						lv_contenu_2_0,
                    						"org.xtext.univ.nantes.master.dsl.Agenda.CONTENU");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getAGENDAAccess().getRightParenthesisKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAGENDA"


    // $ANTLR start "entryRulePREAMBULE"
    // InternalAgenda.g:129:1: entryRulePREAMBULE returns [EObject current=null] : iv_rulePREAMBULE= rulePREAMBULE EOF ;
    public final EObject entryRulePREAMBULE() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePREAMBULE = null;


        try {
            // InternalAgenda.g:129:50: (iv_rulePREAMBULE= rulePREAMBULE EOF )
            // InternalAgenda.g:130:2: iv_rulePREAMBULE= rulePREAMBULE EOF
            {
             newCompositeNode(grammarAccess.getPREAMBULERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePREAMBULE=rulePREAMBULE();

            state._fsp--;

             current =iv_rulePREAMBULE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePREAMBULE"


    // $ANTLR start "rulePREAMBULE"
    // InternalAgenda.g:136:1: rulePREAMBULE returns [EObject current=null] : (otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePREAMBULE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAgenda.g:142:2: ( (otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAgenda.g:143:2: (otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAgenda.g:143:2: (otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAgenda.g:144:3: otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPREAMBULEAccess().getAgendaKeyword_0());
            		
            // InternalAgenda.g:148:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgenda.g:149:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgenda.g:149:4: (lv_name_1_0= RULE_ID )
            // InternalAgenda.g:150:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPREAMBULEAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPREAMBULERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePREAMBULE"


    // $ANTLR start "entryRuleCONTENU"
    // InternalAgenda.g:170:1: entryRuleCONTENU returns [EObject current=null] : iv_ruleCONTENU= ruleCONTENU EOF ;
    public final EObject entryRuleCONTENU() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONTENU = null;


        try {
            // InternalAgenda.g:170:48: (iv_ruleCONTENU= ruleCONTENU EOF )
            // InternalAgenda.g:171:2: iv_ruleCONTENU= ruleCONTENU EOF
            {
             newCompositeNode(grammarAccess.getCONTENURule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONTENU=ruleCONTENU();

            state._fsp--;

             current =iv_ruleCONTENU; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONTENU"


    // $ANTLR start "ruleCONTENU"
    // InternalAgenda.g:177:1: ruleCONTENU returns [EObject current=null] : ( ( (lv_desc_0_0= ruleDESCRIPTION ) ) ( (lv_evta_1_0= ruleEVENTS_OR_TASKS ) )* ) ;
    public final EObject ruleCONTENU() throws RecognitionException {
        EObject current = null;

        EObject lv_desc_0_0 = null;

        EObject lv_evta_1_0 = null;



        	enterRule();

        try {
            // InternalAgenda.g:183:2: ( ( ( (lv_desc_0_0= ruleDESCRIPTION ) ) ( (lv_evta_1_0= ruleEVENTS_OR_TASKS ) )* ) )
            // InternalAgenda.g:184:2: ( ( (lv_desc_0_0= ruleDESCRIPTION ) ) ( (lv_evta_1_0= ruleEVENTS_OR_TASKS ) )* )
            {
            // InternalAgenda.g:184:2: ( ( (lv_desc_0_0= ruleDESCRIPTION ) ) ( (lv_evta_1_0= ruleEVENTS_OR_TASKS ) )* )
            // InternalAgenda.g:185:3: ( (lv_desc_0_0= ruleDESCRIPTION ) ) ( (lv_evta_1_0= ruleEVENTS_OR_TASKS ) )*
            {
            // InternalAgenda.g:185:3: ( (lv_desc_0_0= ruleDESCRIPTION ) )
            // InternalAgenda.g:186:4: (lv_desc_0_0= ruleDESCRIPTION )
            {
            // InternalAgenda.g:186:4: (lv_desc_0_0= ruleDESCRIPTION )
            // InternalAgenda.g:187:5: lv_desc_0_0= ruleDESCRIPTION
            {

            					newCompositeNode(grammarAccess.getCONTENUAccess().getDescDESCRIPTIONParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_desc_0_0=ruleDESCRIPTION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCONTENURule());
            					}
            					set(
            						current,
            						"desc",
            						lv_desc_0_0,
            						"org.xtext.univ.nantes.master.dsl.Agenda.DESCRIPTION");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAgenda.g:204:3: ( (lv_evta_1_0= ruleEVENTS_OR_TASKS ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAgenda.g:205:4: (lv_evta_1_0= ruleEVENTS_OR_TASKS )
            	    {
            	    // InternalAgenda.g:205:4: (lv_evta_1_0= ruleEVENTS_OR_TASKS )
            	    // InternalAgenda.g:206:5: lv_evta_1_0= ruleEVENTS_OR_TASKS
            	    {

            	    					newCompositeNode(grammarAccess.getCONTENUAccess().getEvtaEVENTS_OR_TASKSParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_evta_1_0=ruleEVENTS_OR_TASKS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCONTENURule());
            	    					}
            	    					add(
            	    						current,
            	    						"evta",
            	    						lv_evta_1_0,
            	    						"org.xtext.univ.nantes.master.dsl.Agenda.EVENTS_OR_TASKS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONTENU"


    // $ANTLR start "entryRuleDESCRIPTION"
    // InternalAgenda.g:227:1: entryRuleDESCRIPTION returns [EObject current=null] : iv_ruleDESCRIPTION= ruleDESCRIPTION EOF ;
    public final EObject entryRuleDESCRIPTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDESCRIPTION = null;


        try {
            // InternalAgenda.g:227:52: (iv_ruleDESCRIPTION= ruleDESCRIPTION EOF )
            // InternalAgenda.g:228:2: iv_ruleDESCRIPTION= ruleDESCRIPTION EOF
            {
             newCompositeNode(grammarAccess.getDESCRIPTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDESCRIPTION=ruleDESCRIPTION();

            state._fsp--;

             current =iv_ruleDESCRIPTION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDESCRIPTION"


    // $ANTLR start "ruleDESCRIPTION"
    // InternalAgenda.g:234:1: ruleDESCRIPTION returns [EObject current=null] : (otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDESCRIPTION() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;


        	enterRule();

        try {
            // InternalAgenda.g:240:2: ( (otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) ) ) )
            // InternalAgenda.g:241:2: (otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // InternalAgenda.g:241:2: (otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) ) )
            // InternalAgenda.g:242:3: otherlv_0= 'Description' ( (lv_description_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDESCRIPTIONAccess().getDescriptionKeyword_0());
            		
            // InternalAgenda.g:246:3: ( (lv_description_1_0= RULE_STRING ) )
            // InternalAgenda.g:247:4: (lv_description_1_0= RULE_STRING )
            {
            // InternalAgenda.g:247:4: (lv_description_1_0= RULE_STRING )
            // InternalAgenda.g:248:5: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_1_0, grammarAccess.getDESCRIPTIONAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDESCRIPTIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDESCRIPTION"


    // $ANTLR start "entryRuleEVENTS_OR_TASKS"
    // InternalAgenda.g:268:1: entryRuleEVENTS_OR_TASKS returns [EObject current=null] : iv_ruleEVENTS_OR_TASKS= ruleEVENTS_OR_TASKS EOF ;
    public final EObject entryRuleEVENTS_OR_TASKS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVENTS_OR_TASKS = null;


        try {
            // InternalAgenda.g:268:56: (iv_ruleEVENTS_OR_TASKS= ruleEVENTS_OR_TASKS EOF )
            // InternalAgenda.g:269:2: iv_ruleEVENTS_OR_TASKS= ruleEVENTS_OR_TASKS EOF
            {
             newCompositeNode(grammarAccess.getEVENTS_OR_TASKSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVENTS_OR_TASKS=ruleEVENTS_OR_TASKS();

            state._fsp--;

             current =iv_ruleEVENTS_OR_TASKS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEVENTS_OR_TASKS"


    // $ANTLR start "ruleEVENTS_OR_TASKS"
    // InternalAgenda.g:275:1: ruleEVENTS_OR_TASKS returns [EObject current=null] : ( ( (lv_event_or_task_0_0= ruleEVENT ) ) | this_TASK_1= ruleTASK ) ;
    public final EObject ruleEVENTS_OR_TASKS() throws RecognitionException {
        EObject current = null;

        EObject lv_event_or_task_0_0 = null;

        EObject this_TASK_1 = null;



        	enterRule();

        try {
            // InternalAgenda.g:281:2: ( ( ( (lv_event_or_task_0_0= ruleEVENT ) ) | this_TASK_1= ruleTASK ) )
            // InternalAgenda.g:282:2: ( ( (lv_event_or_task_0_0= ruleEVENT ) ) | this_TASK_1= ruleTASK )
            {
            // InternalAgenda.g:282:2: ( ( (lv_event_or_task_0_0= ruleEVENT ) ) | this_TASK_1= ruleTASK )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAgenda.g:283:3: ( (lv_event_or_task_0_0= ruleEVENT ) )
                    {
                    // InternalAgenda.g:283:3: ( (lv_event_or_task_0_0= ruleEVENT ) )
                    // InternalAgenda.g:284:4: (lv_event_or_task_0_0= ruleEVENT )
                    {
                    // InternalAgenda.g:284:4: (lv_event_or_task_0_0= ruleEVENT )
                    // InternalAgenda.g:285:5: lv_event_or_task_0_0= ruleEVENT
                    {

                    					newCompositeNode(grammarAccess.getEVENTS_OR_TASKSAccess().getEvent_or_taskEVENTParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_event_or_task_0_0=ruleEVENT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEVENTS_OR_TASKSRule());
                    					}
                    					add(
                    						current,
                    						"event_or_task",
                    						lv_event_or_task_0_0,
                    						"org.xtext.univ.nantes.master.dsl.Agenda.EVENT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAgenda.g:303:3: this_TASK_1= ruleTASK
                    {

                    			newCompositeNode(grammarAccess.getEVENTS_OR_TASKSAccess().getTASKParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TASK_1=ruleTASK();

                    state._fsp--;


                    			current = this_TASK_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVENTS_OR_TASKS"


    // $ANTLR start "entryRuleEVENT"
    // InternalAgenda.g:315:1: entryRuleEVENT returns [EObject current=null] : iv_ruleEVENT= ruleEVENT EOF ;
    public final EObject entryRuleEVENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVENT = null;


        try {
            // InternalAgenda.g:315:46: (iv_ruleEVENT= ruleEVENT EOF )
            // InternalAgenda.g:316:2: iv_ruleEVENT= ruleEVENT EOF
            {
             newCompositeNode(grammarAccess.getEVENTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVENT=ruleEVENT();

            state._fsp--;

             current =iv_ruleEVENT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEVENT"


    // $ANTLR start "ruleEVENT"
    // InternalAgenda.g:322:1: ruleEVENT returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_event_3_0= ruleCONTENT_EVENT ) ) otherlv_4= '}' ) ;
    public final EObject ruleEVENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_content_event_3_0 = null;



        	enterRule();

        try {
            // InternalAgenda.g:328:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_event_3_0= ruleCONTENT_EVENT ) ) otherlv_4= '}' ) )
            // InternalAgenda.g:329:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_event_3_0= ruleCONTENT_EVENT ) ) otherlv_4= '}' )
            {
            // InternalAgenda.g:329:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_event_3_0= ruleCONTENT_EVENT ) ) otherlv_4= '}' )
            // InternalAgenda.g:330:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_event_3_0= ruleCONTENT_EVENT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEVENTAccess().getEventKeyword_0());
            		
            // InternalAgenda.g:334:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgenda.g:335:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgenda.g:335:4: (lv_name_1_0= RULE_ID )
            // InternalAgenda.g:336:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEVENTAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEVENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEVENTAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAgenda.g:356:3: ( (lv_content_event_3_0= ruleCONTENT_EVENT ) )
            // InternalAgenda.g:357:4: (lv_content_event_3_0= ruleCONTENT_EVENT )
            {
            // InternalAgenda.g:357:4: (lv_content_event_3_0= ruleCONTENT_EVENT )
            // InternalAgenda.g:358:5: lv_content_event_3_0= ruleCONTENT_EVENT
            {

            					newCompositeNode(grammarAccess.getEVENTAccess().getContent_eventCONTENT_EVENTParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_content_event_3_0=ruleCONTENT_EVENT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEVENTRule());
            					}
            					set(
            						current,
            						"content_event",
            						lv_content_event_3_0,
            						"org.xtext.univ.nantes.master.dsl.Agenda.CONTENT_EVENT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEVENTAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVENT"


    // $ANTLR start "entryRuleCONTENT_EVENT"
    // InternalAgenda.g:383:1: entryRuleCONTENT_EVENT returns [EObject current=null] : iv_ruleCONTENT_EVENT= ruleCONTENT_EVENT EOF ;
    public final EObject entryRuleCONTENT_EVENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONTENT_EVENT = null;


        try {
            // InternalAgenda.g:383:54: (iv_ruleCONTENT_EVENT= ruleCONTENT_EVENT EOF )
            // InternalAgenda.g:384:2: iv_ruleCONTENT_EVENT= ruleCONTENT_EVENT EOF
            {
             newCompositeNode(grammarAccess.getCONTENT_EVENTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONTENT_EVENT=ruleCONTENT_EVENT();

            state._fsp--;

             current =iv_ruleCONTENT_EVENT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONTENT_EVENT"


    // $ANTLR start "ruleCONTENT_EVENT"
    // InternalAgenda.g:390:1: ruleCONTENT_EVENT returns [EObject current=null] : (otherlv_0= 'Place' ( (lv_place_1_0= RULE_STRING ) ) otherlv_2= 'Date' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= 'Start' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'End' ( (lv_end_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleCONTENT_EVENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_place_1_0=null;
        Token otherlv_2=null;
        Token lv_data_3_0=null;
        Token otherlv_4=null;
        Token lv_start_5_0=null;
        Token otherlv_6=null;
        Token lv_end_7_0=null;


        	enterRule();

        try {
            // InternalAgenda.g:396:2: ( (otherlv_0= 'Place' ( (lv_place_1_0= RULE_STRING ) ) otherlv_2= 'Date' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= 'Start' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'End' ( (lv_end_7_0= RULE_STRING ) ) ) )
            // InternalAgenda.g:397:2: (otherlv_0= 'Place' ( (lv_place_1_0= RULE_STRING ) ) otherlv_2= 'Date' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= 'Start' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'End' ( (lv_end_7_0= RULE_STRING ) ) )
            {
            // InternalAgenda.g:397:2: (otherlv_0= 'Place' ( (lv_place_1_0= RULE_STRING ) ) otherlv_2= 'Date' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= 'Start' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'End' ( (lv_end_7_0= RULE_STRING ) ) )
            // InternalAgenda.g:398:3: otherlv_0= 'Place' ( (lv_place_1_0= RULE_STRING ) ) otherlv_2= 'Date' ( (lv_data_3_0= RULE_STRING ) ) otherlv_4= 'Start' ( (lv_start_5_0= RULE_STRING ) ) otherlv_6= 'End' ( (lv_end_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCONTENT_EVENTAccess().getPlaceKeyword_0());
            		
            // InternalAgenda.g:402:3: ( (lv_place_1_0= RULE_STRING ) )
            // InternalAgenda.g:403:4: (lv_place_1_0= RULE_STRING )
            {
            // InternalAgenda.g:403:4: (lv_place_1_0= RULE_STRING )
            // InternalAgenda.g:404:5: lv_place_1_0= RULE_STRING
            {
            lv_place_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_place_1_0, grammarAccess.getCONTENT_EVENTAccess().getPlaceSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCONTENT_EVENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"place",
            						lv_place_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCONTENT_EVENTAccess().getDateKeyword_2());
            		
            // InternalAgenda.g:424:3: ( (lv_data_3_0= RULE_STRING ) )
            // InternalAgenda.g:425:4: (lv_data_3_0= RULE_STRING )
            {
            // InternalAgenda.g:425:4: (lv_data_3_0= RULE_STRING )
            // InternalAgenda.g:426:5: lv_data_3_0= RULE_STRING
            {
            lv_data_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_data_3_0, grammarAccess.getCONTENT_EVENTAccess().getDataSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCONTENT_EVENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"data",
            						lv_data_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCONTENT_EVENTAccess().getStartKeyword_4());
            		
            // InternalAgenda.g:446:3: ( (lv_start_5_0= RULE_STRING ) )
            // InternalAgenda.g:447:4: (lv_start_5_0= RULE_STRING )
            {
            // InternalAgenda.g:447:4: (lv_start_5_0= RULE_STRING )
            // InternalAgenda.g:448:5: lv_start_5_0= RULE_STRING
            {
            lv_start_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_start_5_0, grammarAccess.getCONTENT_EVENTAccess().getStartSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCONTENT_EVENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getCONTENT_EVENTAccess().getEndKeyword_6());
            		
            // InternalAgenda.g:468:3: ( (lv_end_7_0= RULE_STRING ) )
            // InternalAgenda.g:469:4: (lv_end_7_0= RULE_STRING )
            {
            // InternalAgenda.g:469:4: (lv_end_7_0= RULE_STRING )
            // InternalAgenda.g:470:5: lv_end_7_0= RULE_STRING
            {
            lv_end_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_end_7_0, grammarAccess.getCONTENT_EVENTAccess().getEndSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCONTENT_EVENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONTENT_EVENT"


    // $ANTLR start "entryRuleTASK"
    // InternalAgenda.g:490:1: entryRuleTASK returns [EObject current=null] : iv_ruleTASK= ruleTASK EOF ;
    public final EObject entryRuleTASK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTASK = null;


        try {
            // InternalAgenda.g:490:45: (iv_ruleTASK= ruleTASK EOF )
            // InternalAgenda.g:491:2: iv_ruleTASK= ruleTASK EOF
            {
             newCompositeNode(grammarAccess.getTASKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTASK=ruleTASK();

            state._fsp--;

             current =iv_ruleTASK; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTASK"


    // $ANTLR start "ruleTASK"
    // InternalAgenda.g:497:1: ruleTASK returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleTASK() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_deadline_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAgenda.g:503:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalAgenda.g:504:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalAgenda.g:504:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalAgenda.g:505:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTASKAccess().getTaskKeyword_0());
            		
            // InternalAgenda.g:509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgenda.g:510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgenda.g:510:4: (lv_name_1_0= RULE_ID )
            // InternalAgenda.g:511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTASKAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTASKRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAgenda.g:527:3: (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAgenda.g:528:4: otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getTASKAccess().getRelatesToKeyword_2_0());
                    			
                    // InternalAgenda.g:532:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAgenda.g:533:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAgenda.g:533:5: (otherlv_3= RULE_ID )
                    // InternalAgenda.g:534:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTASKRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getTASKAccess().getNameEventEVENTCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getTASKAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getTASKAccess().getDeadlineKeyword_4());
            		
            // InternalAgenda.g:554:3: ( (lv_deadline_6_0= RULE_STRING ) )
            // InternalAgenda.g:555:4: (lv_deadline_6_0= RULE_STRING )
            {
            // InternalAgenda.g:555:4: (lv_deadline_6_0= RULE_STRING )
            // InternalAgenda.g:556:5: lv_deadline_6_0= RULE_STRING
            {
            lv_deadline_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_deadline_6_0, grammarAccess.getTASKAccess().getDeadlineSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTASKRule());
            					}
            					setWithLastConsumed(
            						current,
            						"deadline",
            						lv_deadline_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTASKAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTASK"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}