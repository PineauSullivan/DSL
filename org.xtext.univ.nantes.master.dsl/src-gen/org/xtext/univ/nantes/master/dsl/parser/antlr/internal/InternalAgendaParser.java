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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Agenda'", "'('", "'Description'", "')'", "'Event'", "'{'", "'Place'", "'Date'", "'Start'", "'End'", "'}'", "'Task'", "'relatesTo'", "'deadline'"
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
        	return "MODEL";
       	}

       	@Override
       	protected AgendaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMODEL"
    // InternalAgenda.g:64:1: entryRuleMODEL returns [EObject current=null] : iv_ruleMODEL= ruleMODEL EOF ;
    public final EObject entryRuleMODEL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODEL = null;


        try {
            // InternalAgenda.g:64:46: (iv_ruleMODEL= ruleMODEL EOF )
            // InternalAgenda.g:65:2: iv_ruleMODEL= ruleMODEL EOF
            {
             newCompositeNode(grammarAccess.getMODELRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMODEL=ruleMODEL();

            state._fsp--;

             current =iv_ruleMODEL; 
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
    // $ANTLR end "entryRuleMODEL"


    // $ANTLR start "ruleMODEL"
    // InternalAgenda.g:71:1: ruleMODEL returns [EObject current=null] : ( (lv_List_0_0= ruleTYPE ) )* ;
    public final EObject ruleMODEL() throws RecognitionException {
        EObject current = null;

        EObject lv_List_0_0 = null;



        	enterRule();

        try {
            // InternalAgenda.g:77:2: ( ( (lv_List_0_0= ruleTYPE ) )* )
            // InternalAgenda.g:78:2: ( (lv_List_0_0= ruleTYPE ) )*
            {
            // InternalAgenda.g:78:2: ( (lv_List_0_0= ruleTYPE ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAgenda.g:79:3: (lv_List_0_0= ruleTYPE )
            	    {
            	    // InternalAgenda.g:79:3: (lv_List_0_0= ruleTYPE )
            	    // InternalAgenda.g:80:4: lv_List_0_0= ruleTYPE
            	    {

            	    				newCompositeNode(grammarAccess.getMODELAccess().getListTYPEParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_List_0_0=ruleTYPE();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMODELRule());
            	    				}
            	    				add(
            	    					current,
            	    					"List",
            	    					lv_List_0_0,
            	    					"org.xtext.univ.nantes.master.dsl.Agenda.TYPE");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleMODEL"


    // $ANTLR start "entryRuleTYPE"
    // InternalAgenda.g:100:1: entryRuleTYPE returns [EObject current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final EObject entryRuleTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE = null;


        try {
            // InternalAgenda.g:100:45: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalAgenda.g:101:2: iv_ruleTYPE= ruleTYPE EOF
            {
             newCompositeNode(grammarAccess.getTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;

             current =iv_ruleTYPE; 
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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // InternalAgenda.g:107:1: ruleTYPE returns [EObject current=null] : this_AGENDA_0= ruleAGENDA ;
    public final EObject ruleTYPE() throws RecognitionException {
        EObject current = null;

        EObject this_AGENDA_0 = null;



        	enterRule();

        try {
            // InternalAgenda.g:113:2: (this_AGENDA_0= ruleAGENDA )
            // InternalAgenda.g:114:2: this_AGENDA_0= ruleAGENDA
            {

            		newCompositeNode(grammarAccess.getTYPEAccess().getAGENDAParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AGENDA_0=ruleAGENDA();

            state._fsp--;


            		current = this_AGENDA_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleAGENDA"
    // InternalAgenda.g:125:1: entryRuleAGENDA returns [EObject current=null] : iv_ruleAGENDA= ruleAGENDA EOF ;
    public final EObject entryRuleAGENDA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAGENDA = null;


        try {
            // InternalAgenda.g:125:47: (iv_ruleAGENDA= ruleAGENDA EOF )
            // InternalAgenda.g:126:2: iv_ruleAGENDA= ruleAGENDA EOF
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
    // InternalAgenda.g:132:1: ruleAGENDA returns [EObject current=null] : (otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_event_5_0= ruleEVENT ) )* ( (lv_task_6_0= ruleTASK ) )* otherlv_7= ')' ) ;
    public final EObject ruleAGENDA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_7=null;
        EObject lv_event_5_0 = null;

        EObject lv_task_6_0 = null;



        	enterRule();

        try {
            // InternalAgenda.g:138:2: ( (otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_event_5_0= ruleEVENT ) )* ( (lv_task_6_0= ruleTASK ) )* otherlv_7= ')' ) )
            // InternalAgenda.g:139:2: (otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_event_5_0= ruleEVENT ) )* ( (lv_task_6_0= ruleTASK ) )* otherlv_7= ')' )
            {
            // InternalAgenda.g:139:2: (otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_event_5_0= ruleEVENT ) )* ( (lv_task_6_0= ruleTASK ) )* otherlv_7= ')' )
            // InternalAgenda.g:140:3: otherlv_0= 'Agenda' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) ( (lv_event_5_0= ruleEVENT ) )* ( (lv_task_6_0= ruleTASK ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAGENDAAccess().getAgendaKeyword_0());
            		
            // InternalAgenda.g:144:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgenda.g:145:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgenda.g:145:4: (lv_name_1_0= RULE_ID )
            // InternalAgenda.g:146:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAGENDAAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAGENDARule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAGENDAAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAGENDAAccess().getDescriptionKeyword_3());
            		
            // InternalAgenda.g:170:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalAgenda.g:171:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalAgenda.g:171:4: (lv_description_4_0= RULE_STRING )
            // InternalAgenda.g:172:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_description_4_0, grammarAccess.getAGENDAAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAGENDARule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAgenda.g:188:3: ( (lv_event_5_0= ruleEVENT ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAgenda.g:189:4: (lv_event_5_0= ruleEVENT )
            	    {
            	    // InternalAgenda.g:189:4: (lv_event_5_0= ruleEVENT )
            	    // InternalAgenda.g:190:5: lv_event_5_0= ruleEVENT
            	    {

            	    					newCompositeNode(grammarAccess.getAGENDAAccess().getEventEVENTParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_event_5_0=ruleEVENT();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAGENDARule());
            	    					}
            	    					add(
            	    						current,
            	    						"event",
            	    						lv_event_5_0,
            	    						"org.xtext.univ.nantes.master.dsl.Agenda.EVENT");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAgenda.g:207:3: ( (lv_task_6_0= ruleTASK ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAgenda.g:208:4: (lv_task_6_0= ruleTASK )
            	    {
            	    // InternalAgenda.g:208:4: (lv_task_6_0= ruleTASK )
            	    // InternalAgenda.g:209:5: lv_task_6_0= ruleTASK
            	    {

            	    					newCompositeNode(grammarAccess.getAGENDAAccess().getTaskTASKParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_task_6_0=ruleTASK();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAGENDARule());
            	    					}
            	    					add(
            	    						current,
            	    						"task",
            	    						lv_task_6_0,
            	    						"org.xtext.univ.nantes.master.dsl.Agenda.TASK");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAGENDAAccess().getRightParenthesisKeyword_7());
            		

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


    // $ANTLR start "entryRuleEVENT"
    // InternalAgenda.g:234:1: entryRuleEVENT returns [EObject current=null] : iv_ruleEVENT= ruleEVENT EOF ;
    public final EObject entryRuleEVENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVENT = null;


        try {
            // InternalAgenda.g:234:46: (iv_ruleEVENT= ruleEVENT EOF )
            // InternalAgenda.g:235:2: iv_ruleEVENT= ruleEVENT EOF
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
    // InternalAgenda.g:241:1: ruleEVENT returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Place' ( (lv_place_4_0= RULE_STRING ) ) otherlv_5= 'Date' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'Start' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= 'End' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
    public final EObject ruleEVENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_place_4_0=null;
        Token otherlv_5=null;
        Token lv_date_6_0=null;
        Token otherlv_7=null;
        Token lv_start_8_0=null;
        Token otherlv_9=null;
        Token lv_end_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalAgenda.g:247:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Place' ( (lv_place_4_0= RULE_STRING ) ) otherlv_5= 'Date' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'Start' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= 'End' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalAgenda.g:248:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Place' ( (lv_place_4_0= RULE_STRING ) ) otherlv_5= 'Date' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'Start' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= 'End' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalAgenda.g:248:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Place' ( (lv_place_4_0= RULE_STRING ) ) otherlv_5= 'Date' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'Start' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= 'End' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalAgenda.g:249:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Place' ( (lv_place_4_0= RULE_STRING ) ) otherlv_5= 'Date' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'Start' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= 'End' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEVENTAccess().getEventKeyword_0());
            		
            // InternalAgenda.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgenda.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgenda.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalAgenda.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEVENTAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEVENTAccess().getPlaceKeyword_3());
            		
            // InternalAgenda.g:279:3: ( (lv_place_4_0= RULE_STRING ) )
            // InternalAgenda.g:280:4: (lv_place_4_0= RULE_STRING )
            {
            // InternalAgenda.g:280:4: (lv_place_4_0= RULE_STRING )
            // InternalAgenda.g:281:5: lv_place_4_0= RULE_STRING
            {
            lv_place_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_place_4_0, grammarAccess.getEVENTAccess().getPlaceSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEVENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"place",
            						lv_place_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getEVENTAccess().getDateKeyword_5());
            		
            // InternalAgenda.g:301:3: ( (lv_date_6_0= RULE_STRING ) )
            // InternalAgenda.g:302:4: (lv_date_6_0= RULE_STRING )
            {
            // InternalAgenda.g:302:4: (lv_date_6_0= RULE_STRING )
            // InternalAgenda.g:303:5: lv_date_6_0= RULE_STRING
            {
            lv_date_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_date_6_0, grammarAccess.getEVENTAccess().getDateSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEVENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getEVENTAccess().getStartKeyword_7());
            		
            // InternalAgenda.g:323:3: ( (lv_start_8_0= RULE_STRING ) )
            // InternalAgenda.g:324:4: (lv_start_8_0= RULE_STRING )
            {
            // InternalAgenda.g:324:4: (lv_start_8_0= RULE_STRING )
            // InternalAgenda.g:325:5: lv_start_8_0= RULE_STRING
            {
            lv_start_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_start_8_0, grammarAccess.getEVENTAccess().getStartSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEVENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getEVENTAccess().getEndKeyword_9());
            		
            // InternalAgenda.g:345:3: ( (lv_end_10_0= RULE_STRING ) )
            // InternalAgenda.g:346:4: (lv_end_10_0= RULE_STRING )
            {
            // InternalAgenda.g:346:4: (lv_end_10_0= RULE_STRING )
            // InternalAgenda.g:347:5: lv_end_10_0= RULE_STRING
            {
            lv_end_10_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_end_10_0, grammarAccess.getEVENTAccess().getEndSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEVENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEVENTAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleTASK"
    // InternalAgenda.g:371:1: entryRuleTASK returns [EObject current=null] : iv_ruleTASK= ruleTASK EOF ;
    public final EObject entryRuleTASK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTASK = null;


        try {
            // InternalAgenda.g:371:45: (iv_ruleTASK= ruleTASK EOF )
            // InternalAgenda.g:372:2: iv_ruleTASK= ruleTASK EOF
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
    // InternalAgenda.g:378:1: ruleTASK returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalAgenda.g:384:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalAgenda.g:385:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalAgenda.g:385:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalAgenda.g:386:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'deadline' ( (lv_deadline_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTASKAccess().getTaskKeyword_0());
            		
            // InternalAgenda.g:390:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgenda.g:391:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgenda.g:391:4: (lv_name_1_0= RULE_ID )
            // InternalAgenda.g:392:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalAgenda.g:408:3: (otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAgenda.g:409:4: otherlv_2= 'relatesTo' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getTASKAccess().getRelatesToKeyword_2_0());
                    			
                    // InternalAgenda.g:413:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAgenda.g:414:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAgenda.g:414:5: (otherlv_3= RULE_ID )
                    // InternalAgenda.g:415:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTASKRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_3, grammarAccess.getTASKAccess().getRefEventEVENTCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getTASKAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getTASKAccess().getDeadlineKeyword_4());
            		
            // InternalAgenda.g:435:3: ( (lv_deadline_6_0= RULE_STRING ) )
            // InternalAgenda.g:436:4: (lv_deadline_6_0= RULE_STRING )
            {
            // InternalAgenda.g:436:4: (lv_deadline_6_0= RULE_STRING )
            // InternalAgenda.g:437:5: lv_deadline_6_0= RULE_STRING
            {
            lv_deadline_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000040C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});

}