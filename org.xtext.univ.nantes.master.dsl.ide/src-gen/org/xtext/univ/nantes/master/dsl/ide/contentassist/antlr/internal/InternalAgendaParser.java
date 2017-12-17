package org.xtext.univ.nantes.master.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.univ.nantes.master.dsl.services.AgendaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAgendaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Agenda'", "'('", "'Description'", "')'", "'Event'", "'{'", "'Place'", "'Date'", "'Start'", "'End'", "'}'", "'Task'", "'deadline'", "'relatesTo'"
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

    	public void setGrammarAccess(AgendaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMODEL"
    // InternalAgenda.g:53:1: entryRuleMODEL : ruleMODEL EOF ;
    public final void entryRuleMODEL() throws RecognitionException {
        try {
            // InternalAgenda.g:54:1: ( ruleMODEL EOF )
            // InternalAgenda.g:55:1: ruleMODEL EOF
            {
             before(grammarAccess.getMODELRule()); 
            pushFollow(FOLLOW_1);
            ruleMODEL();

            state._fsp--;

             after(grammarAccess.getMODELRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMODEL"


    // $ANTLR start "ruleMODEL"
    // InternalAgenda.g:62:1: ruleMODEL : ( ( rule__MODEL__EntiteAssignment ) ) ;
    public final void ruleMODEL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:66:2: ( ( ( rule__MODEL__EntiteAssignment ) ) )
            // InternalAgenda.g:67:2: ( ( rule__MODEL__EntiteAssignment ) )
            {
            // InternalAgenda.g:67:2: ( ( rule__MODEL__EntiteAssignment ) )
            // InternalAgenda.g:68:3: ( rule__MODEL__EntiteAssignment )
            {
             before(grammarAccess.getMODELAccess().getEntiteAssignment()); 
            // InternalAgenda.g:69:3: ( rule__MODEL__EntiteAssignment )
            // InternalAgenda.g:69:4: rule__MODEL__EntiteAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MODEL__EntiteAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMODELAccess().getEntiteAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMODEL"


    // $ANTLR start "entryRuleTYPE"
    // InternalAgenda.g:78:1: entryRuleTYPE : ruleTYPE EOF ;
    public final void entryRuleTYPE() throws RecognitionException {
        try {
            // InternalAgenda.g:79:1: ( ruleTYPE EOF )
            // InternalAgenda.g:80:1: ruleTYPE EOF
            {
             before(grammarAccess.getTYPERule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE();

            state._fsp--;

             after(grammarAccess.getTYPERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // InternalAgenda.g:87:1: ruleTYPE : ( ruleAGENDA ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:91:2: ( ( ruleAGENDA ) )
            // InternalAgenda.g:92:2: ( ruleAGENDA )
            {
            // InternalAgenda.g:92:2: ( ruleAGENDA )
            // InternalAgenda.g:93:3: ruleAGENDA
            {
             before(grammarAccess.getTYPEAccess().getAGENDAParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAGENDA();

            state._fsp--;

             after(grammarAccess.getTYPEAccess().getAGENDAParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleAGENDA"
    // InternalAgenda.g:103:1: entryRuleAGENDA : ruleAGENDA EOF ;
    public final void entryRuleAGENDA() throws RecognitionException {
        try {
            // InternalAgenda.g:104:1: ( ruleAGENDA EOF )
            // InternalAgenda.g:105:1: ruleAGENDA EOF
            {
             before(grammarAccess.getAGENDARule()); 
            pushFollow(FOLLOW_1);
            ruleAGENDA();

            state._fsp--;

             after(grammarAccess.getAGENDARule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAGENDA"


    // $ANTLR start "ruleAGENDA"
    // InternalAgenda.g:112:1: ruleAGENDA : ( ( rule__AGENDA__Group__0 ) ) ;
    public final void ruleAGENDA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:116:2: ( ( ( rule__AGENDA__Group__0 ) ) )
            // InternalAgenda.g:117:2: ( ( rule__AGENDA__Group__0 ) )
            {
            // InternalAgenda.g:117:2: ( ( rule__AGENDA__Group__0 ) )
            // InternalAgenda.g:118:3: ( rule__AGENDA__Group__0 )
            {
             before(grammarAccess.getAGENDAAccess().getGroup()); 
            // InternalAgenda.g:119:3: ( rule__AGENDA__Group__0 )
            // InternalAgenda.g:119:4: rule__AGENDA__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AGENDA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAGENDAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAGENDA"


    // $ANTLR start "entryRuleEVENT"
    // InternalAgenda.g:128:1: entryRuleEVENT : ruleEVENT EOF ;
    public final void entryRuleEVENT() throws RecognitionException {
        try {
            // InternalAgenda.g:129:1: ( ruleEVENT EOF )
            // InternalAgenda.g:130:1: ruleEVENT EOF
            {
             before(grammarAccess.getEVENTRule()); 
            pushFollow(FOLLOW_1);
            ruleEVENT();

            state._fsp--;

             after(grammarAccess.getEVENTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEVENT"


    // $ANTLR start "ruleEVENT"
    // InternalAgenda.g:137:1: ruleEVENT : ( ( rule__EVENT__Group__0 ) ) ;
    public final void ruleEVENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:141:2: ( ( ( rule__EVENT__Group__0 ) ) )
            // InternalAgenda.g:142:2: ( ( rule__EVENT__Group__0 ) )
            {
            // InternalAgenda.g:142:2: ( ( rule__EVENT__Group__0 ) )
            // InternalAgenda.g:143:3: ( rule__EVENT__Group__0 )
            {
             before(grammarAccess.getEVENTAccess().getGroup()); 
            // InternalAgenda.g:144:3: ( rule__EVENT__Group__0 )
            // InternalAgenda.g:144:4: rule__EVENT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EVENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEVENTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENT"


    // $ANTLR start "entryRuleTASK"
    // InternalAgenda.g:153:1: entryRuleTASK : ruleTASK EOF ;
    public final void entryRuleTASK() throws RecognitionException {
        try {
            // InternalAgenda.g:154:1: ( ruleTASK EOF )
            // InternalAgenda.g:155:1: ruleTASK EOF
            {
             before(grammarAccess.getTASKRule()); 
            pushFollow(FOLLOW_1);
            ruleTASK();

            state._fsp--;

             after(grammarAccess.getTASKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTASK"


    // $ANTLR start "ruleTASK"
    // InternalAgenda.g:162:1: ruleTASK : ( ( rule__TASK__Group__0 ) ) ;
    public final void ruleTASK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:166:2: ( ( ( rule__TASK__Group__0 ) ) )
            // InternalAgenda.g:167:2: ( ( rule__TASK__Group__0 ) )
            {
            // InternalAgenda.g:167:2: ( ( rule__TASK__Group__0 ) )
            // InternalAgenda.g:168:3: ( rule__TASK__Group__0 )
            {
             before(grammarAccess.getTASKAccess().getGroup()); 
            // InternalAgenda.g:169:3: ( rule__TASK__Group__0 )
            // InternalAgenda.g:169:4: rule__TASK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TASK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTASKAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTASK"


    // $ANTLR start "rule__AGENDA__Group__0"
    // InternalAgenda.g:177:1: rule__AGENDA__Group__0 : rule__AGENDA__Group__0__Impl rule__AGENDA__Group__1 ;
    public final void rule__AGENDA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:181:1: ( rule__AGENDA__Group__0__Impl rule__AGENDA__Group__1 )
            // InternalAgenda.g:182:2: rule__AGENDA__Group__0__Impl rule__AGENDA__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AGENDA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AGENDA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__0"


    // $ANTLR start "rule__AGENDA__Group__0__Impl"
    // InternalAgenda.g:189:1: rule__AGENDA__Group__0__Impl : ( 'Agenda' ) ;
    public final void rule__AGENDA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:193:1: ( ( 'Agenda' ) )
            // InternalAgenda.g:194:1: ( 'Agenda' )
            {
            // InternalAgenda.g:194:1: ( 'Agenda' )
            // InternalAgenda.g:195:2: 'Agenda'
            {
             before(grammarAccess.getAGENDAAccess().getAgendaKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAGENDAAccess().getAgendaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__0__Impl"


    // $ANTLR start "rule__AGENDA__Group__1"
    // InternalAgenda.g:204:1: rule__AGENDA__Group__1 : rule__AGENDA__Group__1__Impl rule__AGENDA__Group__2 ;
    public final void rule__AGENDA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:208:1: ( rule__AGENDA__Group__1__Impl rule__AGENDA__Group__2 )
            // InternalAgenda.g:209:2: rule__AGENDA__Group__1__Impl rule__AGENDA__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AGENDA__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AGENDA__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__1"


    // $ANTLR start "rule__AGENDA__Group__1__Impl"
    // InternalAgenda.g:216:1: rule__AGENDA__Group__1__Impl : ( ( rule__AGENDA__NameAssignment_1 ) ) ;
    public final void rule__AGENDA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:220:1: ( ( ( rule__AGENDA__NameAssignment_1 ) ) )
            // InternalAgenda.g:221:1: ( ( rule__AGENDA__NameAssignment_1 ) )
            {
            // InternalAgenda.g:221:1: ( ( rule__AGENDA__NameAssignment_1 ) )
            // InternalAgenda.g:222:2: ( rule__AGENDA__NameAssignment_1 )
            {
             before(grammarAccess.getAGENDAAccess().getNameAssignment_1()); 
            // InternalAgenda.g:223:2: ( rule__AGENDA__NameAssignment_1 )
            // InternalAgenda.g:223:3: rule__AGENDA__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AGENDA__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAGENDAAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__1__Impl"


    // $ANTLR start "rule__AGENDA__Group__2"
    // InternalAgenda.g:231:1: rule__AGENDA__Group__2 : rule__AGENDA__Group__2__Impl rule__AGENDA__Group__3 ;
    public final void rule__AGENDA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:235:1: ( rule__AGENDA__Group__2__Impl rule__AGENDA__Group__3 )
            // InternalAgenda.g:236:2: rule__AGENDA__Group__2__Impl rule__AGENDA__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AGENDA__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AGENDA__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__2"


    // $ANTLR start "rule__AGENDA__Group__2__Impl"
    // InternalAgenda.g:243:1: rule__AGENDA__Group__2__Impl : ( '(' ) ;
    public final void rule__AGENDA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:247:1: ( ( '(' ) )
            // InternalAgenda.g:248:1: ( '(' )
            {
            // InternalAgenda.g:248:1: ( '(' )
            // InternalAgenda.g:249:2: '('
            {
             before(grammarAccess.getAGENDAAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAGENDAAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__2__Impl"


    // $ANTLR start "rule__AGENDA__Group__3"
    // InternalAgenda.g:258:1: rule__AGENDA__Group__3 : rule__AGENDA__Group__3__Impl rule__AGENDA__Group__4 ;
    public final void rule__AGENDA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:262:1: ( rule__AGENDA__Group__3__Impl rule__AGENDA__Group__4 )
            // InternalAgenda.g:263:2: rule__AGENDA__Group__3__Impl rule__AGENDA__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AGENDA__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AGENDA__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__3"


    // $ANTLR start "rule__AGENDA__Group__3__Impl"
    // InternalAgenda.g:270:1: rule__AGENDA__Group__3__Impl : ( 'Description' ) ;
    public final void rule__AGENDA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:274:1: ( ( 'Description' ) )
            // InternalAgenda.g:275:1: ( 'Description' )
            {
            // InternalAgenda.g:275:1: ( 'Description' )
            // InternalAgenda.g:276:2: 'Description'
            {
             before(grammarAccess.getAGENDAAccess().getDescriptionKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAGENDAAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__3__Impl"


    // $ANTLR start "rule__AGENDA__Group__4"
    // InternalAgenda.g:285:1: rule__AGENDA__Group__4 : rule__AGENDA__Group__4__Impl rule__AGENDA__Group__5 ;
    public final void rule__AGENDA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:289:1: ( rule__AGENDA__Group__4__Impl rule__AGENDA__Group__5 )
            // InternalAgenda.g:290:2: rule__AGENDA__Group__4__Impl rule__AGENDA__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AGENDA__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AGENDA__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__4"


    // $ANTLR start "rule__AGENDA__Group__4__Impl"
    // InternalAgenda.g:297:1: rule__AGENDA__Group__4__Impl : ( ( rule__AGENDA__DescriptionAssignment_4 ) ) ;
    public final void rule__AGENDA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:301:1: ( ( ( rule__AGENDA__DescriptionAssignment_4 ) ) )
            // InternalAgenda.g:302:1: ( ( rule__AGENDA__DescriptionAssignment_4 ) )
            {
            // InternalAgenda.g:302:1: ( ( rule__AGENDA__DescriptionAssignment_4 ) )
            // InternalAgenda.g:303:2: ( rule__AGENDA__DescriptionAssignment_4 )
            {
             before(grammarAccess.getAGENDAAccess().getDescriptionAssignment_4()); 
            // InternalAgenda.g:304:2: ( rule__AGENDA__DescriptionAssignment_4 )
            // InternalAgenda.g:304:3: rule__AGENDA__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AGENDA__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAGENDAAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__4__Impl"


    // $ANTLR start "rule__AGENDA__Group__5"
    // InternalAgenda.g:312:1: rule__AGENDA__Group__5 : rule__AGENDA__Group__5__Impl rule__AGENDA__Group__6 ;
    public final void rule__AGENDA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:316:1: ( rule__AGENDA__Group__5__Impl rule__AGENDA__Group__6 )
            // InternalAgenda.g:317:2: rule__AGENDA__Group__5__Impl rule__AGENDA__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__AGENDA__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AGENDA__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__5"


    // $ANTLR start "rule__AGENDA__Group__5__Impl"
    // InternalAgenda.g:324:1: rule__AGENDA__Group__5__Impl : ( ( rule__AGENDA__EventAssignment_5 )* ) ;
    public final void rule__AGENDA__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:328:1: ( ( ( rule__AGENDA__EventAssignment_5 )* ) )
            // InternalAgenda.g:329:1: ( ( rule__AGENDA__EventAssignment_5 )* )
            {
            // InternalAgenda.g:329:1: ( ( rule__AGENDA__EventAssignment_5 )* )
            // InternalAgenda.g:330:2: ( rule__AGENDA__EventAssignment_5 )*
            {
             before(grammarAccess.getAGENDAAccess().getEventAssignment_5()); 
            // InternalAgenda.g:331:2: ( rule__AGENDA__EventAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAgenda.g:331:3: rule__AGENDA__EventAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AGENDA__EventAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAGENDAAccess().getEventAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__5__Impl"


    // $ANTLR start "rule__AGENDA__Group__6"
    // InternalAgenda.g:339:1: rule__AGENDA__Group__6 : rule__AGENDA__Group__6__Impl rule__AGENDA__Group__7 ;
    public final void rule__AGENDA__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:343:1: ( rule__AGENDA__Group__6__Impl rule__AGENDA__Group__7 )
            // InternalAgenda.g:344:2: rule__AGENDA__Group__6__Impl rule__AGENDA__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__AGENDA__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AGENDA__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__6"


    // $ANTLR start "rule__AGENDA__Group__6__Impl"
    // InternalAgenda.g:351:1: rule__AGENDA__Group__6__Impl : ( ( rule__AGENDA__TaskAssignment_6 )* ) ;
    public final void rule__AGENDA__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:355:1: ( ( ( rule__AGENDA__TaskAssignment_6 )* ) )
            // InternalAgenda.g:356:1: ( ( rule__AGENDA__TaskAssignment_6 )* )
            {
            // InternalAgenda.g:356:1: ( ( rule__AGENDA__TaskAssignment_6 )* )
            // InternalAgenda.g:357:2: ( rule__AGENDA__TaskAssignment_6 )*
            {
             before(grammarAccess.getAGENDAAccess().getTaskAssignment_6()); 
            // InternalAgenda.g:358:2: ( rule__AGENDA__TaskAssignment_6 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAgenda.g:358:3: rule__AGENDA__TaskAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AGENDA__TaskAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAGENDAAccess().getTaskAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__6__Impl"


    // $ANTLR start "rule__AGENDA__Group__7"
    // InternalAgenda.g:366:1: rule__AGENDA__Group__7 : rule__AGENDA__Group__7__Impl ;
    public final void rule__AGENDA__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:370:1: ( rule__AGENDA__Group__7__Impl )
            // InternalAgenda.g:371:2: rule__AGENDA__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AGENDA__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__7"


    // $ANTLR start "rule__AGENDA__Group__7__Impl"
    // InternalAgenda.g:377:1: rule__AGENDA__Group__7__Impl : ( ')' ) ;
    public final void rule__AGENDA__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:381:1: ( ( ')' ) )
            // InternalAgenda.g:382:1: ( ')' )
            {
            // InternalAgenda.g:382:1: ( ')' )
            // InternalAgenda.g:383:2: ')'
            {
             before(grammarAccess.getAGENDAAccess().getRightParenthesisKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAGENDAAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__Group__7__Impl"


    // $ANTLR start "rule__EVENT__Group__0"
    // InternalAgenda.g:393:1: rule__EVENT__Group__0 : rule__EVENT__Group__0__Impl rule__EVENT__Group__1 ;
    public final void rule__EVENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:397:1: ( rule__EVENT__Group__0__Impl rule__EVENT__Group__1 )
            // InternalAgenda.g:398:2: rule__EVENT__Group__0__Impl rule__EVENT__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EVENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__0"


    // $ANTLR start "rule__EVENT__Group__0__Impl"
    // InternalAgenda.g:405:1: rule__EVENT__Group__0__Impl : ( 'Event' ) ;
    public final void rule__EVENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:409:1: ( ( 'Event' ) )
            // InternalAgenda.g:410:1: ( 'Event' )
            {
            // InternalAgenda.g:410:1: ( 'Event' )
            // InternalAgenda.g:411:2: 'Event'
            {
             before(grammarAccess.getEVENTAccess().getEventKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__0__Impl"


    // $ANTLR start "rule__EVENT__Group__1"
    // InternalAgenda.g:420:1: rule__EVENT__Group__1 : rule__EVENT__Group__1__Impl rule__EVENT__Group__2 ;
    public final void rule__EVENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:424:1: ( rule__EVENT__Group__1__Impl rule__EVENT__Group__2 )
            // InternalAgenda.g:425:2: rule__EVENT__Group__1__Impl rule__EVENT__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EVENT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__1"


    // $ANTLR start "rule__EVENT__Group__1__Impl"
    // InternalAgenda.g:432:1: rule__EVENT__Group__1__Impl : ( ( rule__EVENT__NameAssignment_1 ) ) ;
    public final void rule__EVENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:436:1: ( ( ( rule__EVENT__NameAssignment_1 ) ) )
            // InternalAgenda.g:437:1: ( ( rule__EVENT__NameAssignment_1 ) )
            {
            // InternalAgenda.g:437:1: ( ( rule__EVENT__NameAssignment_1 ) )
            // InternalAgenda.g:438:2: ( rule__EVENT__NameAssignment_1 )
            {
             before(grammarAccess.getEVENTAccess().getNameAssignment_1()); 
            // InternalAgenda.g:439:2: ( rule__EVENT__NameAssignment_1 )
            // InternalAgenda.g:439:3: rule__EVENT__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EVENT__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEVENTAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__1__Impl"


    // $ANTLR start "rule__EVENT__Group__2"
    // InternalAgenda.g:447:1: rule__EVENT__Group__2 : rule__EVENT__Group__2__Impl rule__EVENT__Group__3 ;
    public final void rule__EVENT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:451:1: ( rule__EVENT__Group__2__Impl rule__EVENT__Group__3 )
            // InternalAgenda.g:452:2: rule__EVENT__Group__2__Impl rule__EVENT__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EVENT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__2"


    // $ANTLR start "rule__EVENT__Group__2__Impl"
    // InternalAgenda.g:459:1: rule__EVENT__Group__2__Impl : ( '{' ) ;
    public final void rule__EVENT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:463:1: ( ( '{' ) )
            // InternalAgenda.g:464:1: ( '{' )
            {
            // InternalAgenda.g:464:1: ( '{' )
            // InternalAgenda.g:465:2: '{'
            {
             before(grammarAccess.getEVENTAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__2__Impl"


    // $ANTLR start "rule__EVENT__Group__3"
    // InternalAgenda.g:474:1: rule__EVENT__Group__3 : rule__EVENT__Group__3__Impl rule__EVENT__Group__4 ;
    public final void rule__EVENT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:478:1: ( rule__EVENT__Group__3__Impl rule__EVENT__Group__4 )
            // InternalAgenda.g:479:2: rule__EVENT__Group__3__Impl rule__EVENT__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__EVENT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__3"


    // $ANTLR start "rule__EVENT__Group__3__Impl"
    // InternalAgenda.g:486:1: rule__EVENT__Group__3__Impl : ( 'Place' ) ;
    public final void rule__EVENT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:490:1: ( ( 'Place' ) )
            // InternalAgenda.g:491:1: ( 'Place' )
            {
            // InternalAgenda.g:491:1: ( 'Place' )
            // InternalAgenda.g:492:2: 'Place'
            {
             before(grammarAccess.getEVENTAccess().getPlaceKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getPlaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__3__Impl"


    // $ANTLR start "rule__EVENT__Group__4"
    // InternalAgenda.g:501:1: rule__EVENT__Group__4 : rule__EVENT__Group__4__Impl rule__EVENT__Group__5 ;
    public final void rule__EVENT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:505:1: ( rule__EVENT__Group__4__Impl rule__EVENT__Group__5 )
            // InternalAgenda.g:506:2: rule__EVENT__Group__4__Impl rule__EVENT__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__EVENT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__4"


    // $ANTLR start "rule__EVENT__Group__4__Impl"
    // InternalAgenda.g:513:1: rule__EVENT__Group__4__Impl : ( ( rule__EVENT__PlaceAssignment_4 ) ) ;
    public final void rule__EVENT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:517:1: ( ( ( rule__EVENT__PlaceAssignment_4 ) ) )
            // InternalAgenda.g:518:1: ( ( rule__EVENT__PlaceAssignment_4 ) )
            {
            // InternalAgenda.g:518:1: ( ( rule__EVENT__PlaceAssignment_4 ) )
            // InternalAgenda.g:519:2: ( rule__EVENT__PlaceAssignment_4 )
            {
             before(grammarAccess.getEVENTAccess().getPlaceAssignment_4()); 
            // InternalAgenda.g:520:2: ( rule__EVENT__PlaceAssignment_4 )
            // InternalAgenda.g:520:3: rule__EVENT__PlaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EVENT__PlaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEVENTAccess().getPlaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__4__Impl"


    // $ANTLR start "rule__EVENT__Group__5"
    // InternalAgenda.g:528:1: rule__EVENT__Group__5 : rule__EVENT__Group__5__Impl rule__EVENT__Group__6 ;
    public final void rule__EVENT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:532:1: ( rule__EVENT__Group__5__Impl rule__EVENT__Group__6 )
            // InternalAgenda.g:533:2: rule__EVENT__Group__5__Impl rule__EVENT__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__EVENT__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__5"


    // $ANTLR start "rule__EVENT__Group__5__Impl"
    // InternalAgenda.g:540:1: rule__EVENT__Group__5__Impl : ( 'Date' ) ;
    public final void rule__EVENT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:544:1: ( ( 'Date' ) )
            // InternalAgenda.g:545:1: ( 'Date' )
            {
            // InternalAgenda.g:545:1: ( 'Date' )
            // InternalAgenda.g:546:2: 'Date'
            {
             before(grammarAccess.getEVENTAccess().getDateKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getDateKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__5__Impl"


    // $ANTLR start "rule__EVENT__Group__6"
    // InternalAgenda.g:555:1: rule__EVENT__Group__6 : rule__EVENT__Group__6__Impl rule__EVENT__Group__7 ;
    public final void rule__EVENT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:559:1: ( rule__EVENT__Group__6__Impl rule__EVENT__Group__7 )
            // InternalAgenda.g:560:2: rule__EVENT__Group__6__Impl rule__EVENT__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__EVENT__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__6"


    // $ANTLR start "rule__EVENT__Group__6__Impl"
    // InternalAgenda.g:567:1: rule__EVENT__Group__6__Impl : ( ( rule__EVENT__DateAssignment_6 ) ) ;
    public final void rule__EVENT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:571:1: ( ( ( rule__EVENT__DateAssignment_6 ) ) )
            // InternalAgenda.g:572:1: ( ( rule__EVENT__DateAssignment_6 ) )
            {
            // InternalAgenda.g:572:1: ( ( rule__EVENT__DateAssignment_6 ) )
            // InternalAgenda.g:573:2: ( rule__EVENT__DateAssignment_6 )
            {
             before(grammarAccess.getEVENTAccess().getDateAssignment_6()); 
            // InternalAgenda.g:574:2: ( rule__EVENT__DateAssignment_6 )
            // InternalAgenda.g:574:3: rule__EVENT__DateAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EVENT__DateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEVENTAccess().getDateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__6__Impl"


    // $ANTLR start "rule__EVENT__Group__7"
    // InternalAgenda.g:582:1: rule__EVENT__Group__7 : rule__EVENT__Group__7__Impl rule__EVENT__Group__8 ;
    public final void rule__EVENT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:586:1: ( rule__EVENT__Group__7__Impl rule__EVENT__Group__8 )
            // InternalAgenda.g:587:2: rule__EVENT__Group__7__Impl rule__EVENT__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__EVENT__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__7"


    // $ANTLR start "rule__EVENT__Group__7__Impl"
    // InternalAgenda.g:594:1: rule__EVENT__Group__7__Impl : ( 'Start' ) ;
    public final void rule__EVENT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:598:1: ( ( 'Start' ) )
            // InternalAgenda.g:599:1: ( 'Start' )
            {
            // InternalAgenda.g:599:1: ( 'Start' )
            // InternalAgenda.g:600:2: 'Start'
            {
             before(grammarAccess.getEVENTAccess().getStartKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getStartKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__7__Impl"


    // $ANTLR start "rule__EVENT__Group__8"
    // InternalAgenda.g:609:1: rule__EVENT__Group__8 : rule__EVENT__Group__8__Impl rule__EVENT__Group__9 ;
    public final void rule__EVENT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:613:1: ( rule__EVENT__Group__8__Impl rule__EVENT__Group__9 )
            // InternalAgenda.g:614:2: rule__EVENT__Group__8__Impl rule__EVENT__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__EVENT__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__8"


    // $ANTLR start "rule__EVENT__Group__8__Impl"
    // InternalAgenda.g:621:1: rule__EVENT__Group__8__Impl : ( ( rule__EVENT__StartAssignment_8 ) ) ;
    public final void rule__EVENT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:625:1: ( ( ( rule__EVENT__StartAssignment_8 ) ) )
            // InternalAgenda.g:626:1: ( ( rule__EVENT__StartAssignment_8 ) )
            {
            // InternalAgenda.g:626:1: ( ( rule__EVENT__StartAssignment_8 ) )
            // InternalAgenda.g:627:2: ( rule__EVENT__StartAssignment_8 )
            {
             before(grammarAccess.getEVENTAccess().getStartAssignment_8()); 
            // InternalAgenda.g:628:2: ( rule__EVENT__StartAssignment_8 )
            // InternalAgenda.g:628:3: rule__EVENT__StartAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__EVENT__StartAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEVENTAccess().getStartAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__8__Impl"


    // $ANTLR start "rule__EVENT__Group__9"
    // InternalAgenda.g:636:1: rule__EVENT__Group__9 : rule__EVENT__Group__9__Impl rule__EVENT__Group__10 ;
    public final void rule__EVENT__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:640:1: ( rule__EVENT__Group__9__Impl rule__EVENT__Group__10 )
            // InternalAgenda.g:641:2: rule__EVENT__Group__9__Impl rule__EVENT__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__EVENT__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__9"


    // $ANTLR start "rule__EVENT__Group__9__Impl"
    // InternalAgenda.g:648:1: rule__EVENT__Group__9__Impl : ( 'End' ) ;
    public final void rule__EVENT__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:652:1: ( ( 'End' ) )
            // InternalAgenda.g:653:1: ( 'End' )
            {
            // InternalAgenda.g:653:1: ( 'End' )
            // InternalAgenda.g:654:2: 'End'
            {
             before(grammarAccess.getEVENTAccess().getEndKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getEndKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__9__Impl"


    // $ANTLR start "rule__EVENT__Group__10"
    // InternalAgenda.g:663:1: rule__EVENT__Group__10 : rule__EVENT__Group__10__Impl rule__EVENT__Group__11 ;
    public final void rule__EVENT__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:667:1: ( rule__EVENT__Group__10__Impl rule__EVENT__Group__11 )
            // InternalAgenda.g:668:2: rule__EVENT__Group__10__Impl rule__EVENT__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__EVENT__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENT__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__10"


    // $ANTLR start "rule__EVENT__Group__10__Impl"
    // InternalAgenda.g:675:1: rule__EVENT__Group__10__Impl : ( ( rule__EVENT__EndAssignment_10 ) ) ;
    public final void rule__EVENT__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:679:1: ( ( ( rule__EVENT__EndAssignment_10 ) ) )
            // InternalAgenda.g:680:1: ( ( rule__EVENT__EndAssignment_10 ) )
            {
            // InternalAgenda.g:680:1: ( ( rule__EVENT__EndAssignment_10 ) )
            // InternalAgenda.g:681:2: ( rule__EVENT__EndAssignment_10 )
            {
             before(grammarAccess.getEVENTAccess().getEndAssignment_10()); 
            // InternalAgenda.g:682:2: ( rule__EVENT__EndAssignment_10 )
            // InternalAgenda.g:682:3: rule__EVENT__EndAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__EVENT__EndAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEVENTAccess().getEndAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__10__Impl"


    // $ANTLR start "rule__EVENT__Group__11"
    // InternalAgenda.g:690:1: rule__EVENT__Group__11 : rule__EVENT__Group__11__Impl ;
    public final void rule__EVENT__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:694:1: ( rule__EVENT__Group__11__Impl )
            // InternalAgenda.g:695:2: rule__EVENT__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EVENT__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__11"


    // $ANTLR start "rule__EVENT__Group__11__Impl"
    // InternalAgenda.g:701:1: rule__EVENT__Group__11__Impl : ( '}' ) ;
    public final void rule__EVENT__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:705:1: ( ( '}' ) )
            // InternalAgenda.g:706:1: ( '}' )
            {
            // InternalAgenda.g:706:1: ( '}' )
            // InternalAgenda.g:707:2: '}'
            {
             before(grammarAccess.getEVENTAccess().getRightCurlyBracketKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__Group__11__Impl"


    // $ANTLR start "rule__TASK__Group__0"
    // InternalAgenda.g:717:1: rule__TASK__Group__0 : rule__TASK__Group__0__Impl rule__TASK__Group__1 ;
    public final void rule__TASK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:721:1: ( rule__TASK__Group__0__Impl rule__TASK__Group__1 )
            // InternalAgenda.g:722:2: rule__TASK__Group__0__Impl rule__TASK__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TASK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TASK__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__0"


    // $ANTLR start "rule__TASK__Group__0__Impl"
    // InternalAgenda.g:729:1: rule__TASK__Group__0__Impl : ( 'Task' ) ;
    public final void rule__TASK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:733:1: ( ( 'Task' ) )
            // InternalAgenda.g:734:1: ( 'Task' )
            {
            // InternalAgenda.g:734:1: ( 'Task' )
            // InternalAgenda.g:735:2: 'Task'
            {
             before(grammarAccess.getTASKAccess().getTaskKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTASKAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__0__Impl"


    // $ANTLR start "rule__TASK__Group__1"
    // InternalAgenda.g:744:1: rule__TASK__Group__1 : rule__TASK__Group__1__Impl rule__TASK__Group__2 ;
    public final void rule__TASK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:748:1: ( rule__TASK__Group__1__Impl rule__TASK__Group__2 )
            // InternalAgenda.g:749:2: rule__TASK__Group__1__Impl rule__TASK__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TASK__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TASK__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__1"


    // $ANTLR start "rule__TASK__Group__1__Impl"
    // InternalAgenda.g:756:1: rule__TASK__Group__1__Impl : ( ( rule__TASK__NameAssignment_1 ) ) ;
    public final void rule__TASK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:760:1: ( ( ( rule__TASK__NameAssignment_1 ) ) )
            // InternalAgenda.g:761:1: ( ( rule__TASK__NameAssignment_1 ) )
            {
            // InternalAgenda.g:761:1: ( ( rule__TASK__NameAssignment_1 ) )
            // InternalAgenda.g:762:2: ( rule__TASK__NameAssignment_1 )
            {
             before(grammarAccess.getTASKAccess().getNameAssignment_1()); 
            // InternalAgenda.g:763:2: ( rule__TASK__NameAssignment_1 )
            // InternalAgenda.g:763:3: rule__TASK__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TASK__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTASKAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__1__Impl"


    // $ANTLR start "rule__TASK__Group__2"
    // InternalAgenda.g:771:1: rule__TASK__Group__2 : rule__TASK__Group__2__Impl rule__TASK__Group__3 ;
    public final void rule__TASK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:775:1: ( rule__TASK__Group__2__Impl rule__TASK__Group__3 )
            // InternalAgenda.g:776:2: rule__TASK__Group__2__Impl rule__TASK__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TASK__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TASK__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__2"


    // $ANTLR start "rule__TASK__Group__2__Impl"
    // InternalAgenda.g:783:1: rule__TASK__Group__2__Impl : ( ( rule__TASK__Group_2__0 )? ) ;
    public final void rule__TASK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:787:1: ( ( ( rule__TASK__Group_2__0 )? ) )
            // InternalAgenda.g:788:1: ( ( rule__TASK__Group_2__0 )? )
            {
            // InternalAgenda.g:788:1: ( ( rule__TASK__Group_2__0 )? )
            // InternalAgenda.g:789:2: ( rule__TASK__Group_2__0 )?
            {
             before(grammarAccess.getTASKAccess().getGroup_2()); 
            // InternalAgenda.g:790:2: ( rule__TASK__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAgenda.g:790:3: rule__TASK__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TASK__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTASKAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__2__Impl"


    // $ANTLR start "rule__TASK__Group__3"
    // InternalAgenda.g:798:1: rule__TASK__Group__3 : rule__TASK__Group__3__Impl rule__TASK__Group__4 ;
    public final void rule__TASK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:802:1: ( rule__TASK__Group__3__Impl rule__TASK__Group__4 )
            // InternalAgenda.g:803:2: rule__TASK__Group__3__Impl rule__TASK__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__TASK__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TASK__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__3"


    // $ANTLR start "rule__TASK__Group__3__Impl"
    // InternalAgenda.g:810:1: rule__TASK__Group__3__Impl : ( '{' ) ;
    public final void rule__TASK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:814:1: ( ( '{' ) )
            // InternalAgenda.g:815:1: ( '{' )
            {
            // InternalAgenda.g:815:1: ( '{' )
            // InternalAgenda.g:816:2: '{'
            {
             before(grammarAccess.getTASKAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTASKAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__3__Impl"


    // $ANTLR start "rule__TASK__Group__4"
    // InternalAgenda.g:825:1: rule__TASK__Group__4 : rule__TASK__Group__4__Impl rule__TASK__Group__5 ;
    public final void rule__TASK__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:829:1: ( rule__TASK__Group__4__Impl rule__TASK__Group__5 )
            // InternalAgenda.g:830:2: rule__TASK__Group__4__Impl rule__TASK__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__TASK__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TASK__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__4"


    // $ANTLR start "rule__TASK__Group__4__Impl"
    // InternalAgenda.g:837:1: rule__TASK__Group__4__Impl : ( 'deadline' ) ;
    public final void rule__TASK__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:841:1: ( ( 'deadline' ) )
            // InternalAgenda.g:842:1: ( 'deadline' )
            {
            // InternalAgenda.g:842:1: ( 'deadline' )
            // InternalAgenda.g:843:2: 'deadline'
            {
             before(grammarAccess.getTASKAccess().getDeadlineKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTASKAccess().getDeadlineKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__4__Impl"


    // $ANTLR start "rule__TASK__Group__5"
    // InternalAgenda.g:852:1: rule__TASK__Group__5 : rule__TASK__Group__5__Impl rule__TASK__Group__6 ;
    public final void rule__TASK__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:856:1: ( rule__TASK__Group__5__Impl rule__TASK__Group__6 )
            // InternalAgenda.g:857:2: rule__TASK__Group__5__Impl rule__TASK__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__TASK__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TASK__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__5"


    // $ANTLR start "rule__TASK__Group__5__Impl"
    // InternalAgenda.g:864:1: rule__TASK__Group__5__Impl : ( ( rule__TASK__DeadlineAssignment_5 ) ) ;
    public final void rule__TASK__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:868:1: ( ( ( rule__TASK__DeadlineAssignment_5 ) ) )
            // InternalAgenda.g:869:1: ( ( rule__TASK__DeadlineAssignment_5 ) )
            {
            // InternalAgenda.g:869:1: ( ( rule__TASK__DeadlineAssignment_5 ) )
            // InternalAgenda.g:870:2: ( rule__TASK__DeadlineAssignment_5 )
            {
             before(grammarAccess.getTASKAccess().getDeadlineAssignment_5()); 
            // InternalAgenda.g:871:2: ( rule__TASK__DeadlineAssignment_5 )
            // InternalAgenda.g:871:3: rule__TASK__DeadlineAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TASK__DeadlineAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTASKAccess().getDeadlineAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__5__Impl"


    // $ANTLR start "rule__TASK__Group__6"
    // InternalAgenda.g:879:1: rule__TASK__Group__6 : rule__TASK__Group__6__Impl ;
    public final void rule__TASK__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:883:1: ( rule__TASK__Group__6__Impl )
            // InternalAgenda.g:884:2: rule__TASK__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TASK__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__6"


    // $ANTLR start "rule__TASK__Group__6__Impl"
    // InternalAgenda.g:890:1: rule__TASK__Group__6__Impl : ( '}' ) ;
    public final void rule__TASK__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:894:1: ( ( '}' ) )
            // InternalAgenda.g:895:1: ( '}' )
            {
            // InternalAgenda.g:895:1: ( '}' )
            // InternalAgenda.g:896:2: '}'
            {
             before(grammarAccess.getTASKAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTASKAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group__6__Impl"


    // $ANTLR start "rule__TASK__Group_2__0"
    // InternalAgenda.g:906:1: rule__TASK__Group_2__0 : rule__TASK__Group_2__0__Impl rule__TASK__Group_2__1 ;
    public final void rule__TASK__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:910:1: ( rule__TASK__Group_2__0__Impl rule__TASK__Group_2__1 )
            // InternalAgenda.g:911:2: rule__TASK__Group_2__0__Impl rule__TASK__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__TASK__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TASK__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group_2__0"


    // $ANTLR start "rule__TASK__Group_2__0__Impl"
    // InternalAgenda.g:918:1: rule__TASK__Group_2__0__Impl : ( 'relatesTo' ) ;
    public final void rule__TASK__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:922:1: ( ( 'relatesTo' ) )
            // InternalAgenda.g:923:1: ( 'relatesTo' )
            {
            // InternalAgenda.g:923:1: ( 'relatesTo' )
            // InternalAgenda.g:924:2: 'relatesTo'
            {
             before(grammarAccess.getTASKAccess().getRelatesToKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTASKAccess().getRelatesToKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group_2__0__Impl"


    // $ANTLR start "rule__TASK__Group_2__1"
    // InternalAgenda.g:933:1: rule__TASK__Group_2__1 : rule__TASK__Group_2__1__Impl ;
    public final void rule__TASK__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:937:1: ( rule__TASK__Group_2__1__Impl )
            // InternalAgenda.g:938:2: rule__TASK__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TASK__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group_2__1"


    // $ANTLR start "rule__TASK__Group_2__1__Impl"
    // InternalAgenda.g:944:1: rule__TASK__Group_2__1__Impl : ( ( rule__TASK__RefEventAssignment_2_1 ) ) ;
    public final void rule__TASK__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:948:1: ( ( ( rule__TASK__RefEventAssignment_2_1 ) ) )
            // InternalAgenda.g:949:1: ( ( rule__TASK__RefEventAssignment_2_1 ) )
            {
            // InternalAgenda.g:949:1: ( ( rule__TASK__RefEventAssignment_2_1 ) )
            // InternalAgenda.g:950:2: ( rule__TASK__RefEventAssignment_2_1 )
            {
             before(grammarAccess.getTASKAccess().getRefEventAssignment_2_1()); 
            // InternalAgenda.g:951:2: ( rule__TASK__RefEventAssignment_2_1 )
            // InternalAgenda.g:951:3: rule__TASK__RefEventAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TASK__RefEventAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTASKAccess().getRefEventAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__Group_2__1__Impl"


    // $ANTLR start "rule__MODEL__EntiteAssignment"
    // InternalAgenda.g:960:1: rule__MODEL__EntiteAssignment : ( ruleTYPE ) ;
    public final void rule__MODEL__EntiteAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:964:1: ( ( ruleTYPE ) )
            // InternalAgenda.g:965:2: ( ruleTYPE )
            {
            // InternalAgenda.g:965:2: ( ruleTYPE )
            // InternalAgenda.g:966:3: ruleTYPE
            {
             before(grammarAccess.getMODELAccess().getEntiteTYPEParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE();

            state._fsp--;

             after(grammarAccess.getMODELAccess().getEntiteTYPEParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODEL__EntiteAssignment"


    // $ANTLR start "rule__AGENDA__NameAssignment_1"
    // InternalAgenda.g:975:1: rule__AGENDA__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AGENDA__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:979:1: ( ( RULE_ID ) )
            // InternalAgenda.g:980:2: ( RULE_ID )
            {
            // InternalAgenda.g:980:2: ( RULE_ID )
            // InternalAgenda.g:981:3: RULE_ID
            {
             before(grammarAccess.getAGENDAAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAGENDAAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__NameAssignment_1"


    // $ANTLR start "rule__AGENDA__DescriptionAssignment_4"
    // InternalAgenda.g:990:1: rule__AGENDA__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AGENDA__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:994:1: ( ( RULE_STRING ) )
            // InternalAgenda.g:995:2: ( RULE_STRING )
            {
            // InternalAgenda.g:995:2: ( RULE_STRING )
            // InternalAgenda.g:996:3: RULE_STRING
            {
             before(grammarAccess.getAGENDAAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAGENDAAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__DescriptionAssignment_4"


    // $ANTLR start "rule__AGENDA__EventAssignment_5"
    // InternalAgenda.g:1005:1: rule__AGENDA__EventAssignment_5 : ( ruleEVENT ) ;
    public final void rule__AGENDA__EventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1009:1: ( ( ruleEVENT ) )
            // InternalAgenda.g:1010:2: ( ruleEVENT )
            {
            // InternalAgenda.g:1010:2: ( ruleEVENT )
            // InternalAgenda.g:1011:3: ruleEVENT
            {
             before(grammarAccess.getAGENDAAccess().getEventEVENTParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEVENT();

            state._fsp--;

             after(grammarAccess.getAGENDAAccess().getEventEVENTParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__EventAssignment_5"


    // $ANTLR start "rule__AGENDA__TaskAssignment_6"
    // InternalAgenda.g:1020:1: rule__AGENDA__TaskAssignment_6 : ( ruleTASK ) ;
    public final void rule__AGENDA__TaskAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1024:1: ( ( ruleTASK ) )
            // InternalAgenda.g:1025:2: ( ruleTASK )
            {
            // InternalAgenda.g:1025:2: ( ruleTASK )
            // InternalAgenda.g:1026:3: ruleTASK
            {
             before(grammarAccess.getAGENDAAccess().getTaskTASKParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTASK();

            state._fsp--;

             after(grammarAccess.getAGENDAAccess().getTaskTASKParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENDA__TaskAssignment_6"


    // $ANTLR start "rule__EVENT__NameAssignment_1"
    // InternalAgenda.g:1035:1: rule__EVENT__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EVENT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1039:1: ( ( RULE_ID ) )
            // InternalAgenda.g:1040:2: ( RULE_ID )
            {
            // InternalAgenda.g:1040:2: ( RULE_ID )
            // InternalAgenda.g:1041:3: RULE_ID
            {
             before(grammarAccess.getEVENTAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__NameAssignment_1"


    // $ANTLR start "rule__EVENT__PlaceAssignment_4"
    // InternalAgenda.g:1050:1: rule__EVENT__PlaceAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EVENT__PlaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1054:1: ( ( RULE_STRING ) )
            // InternalAgenda.g:1055:2: ( RULE_STRING )
            {
            // InternalAgenda.g:1055:2: ( RULE_STRING )
            // InternalAgenda.g:1056:3: RULE_STRING
            {
             before(grammarAccess.getEVENTAccess().getPlaceSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getPlaceSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__PlaceAssignment_4"


    // $ANTLR start "rule__EVENT__DateAssignment_6"
    // InternalAgenda.g:1065:1: rule__EVENT__DateAssignment_6 : ( RULE_STRING ) ;
    public final void rule__EVENT__DateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1069:1: ( ( RULE_STRING ) )
            // InternalAgenda.g:1070:2: ( RULE_STRING )
            {
            // InternalAgenda.g:1070:2: ( RULE_STRING )
            // InternalAgenda.g:1071:3: RULE_STRING
            {
             before(grammarAccess.getEVENTAccess().getDateSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getDateSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__DateAssignment_6"


    // $ANTLR start "rule__EVENT__StartAssignment_8"
    // InternalAgenda.g:1080:1: rule__EVENT__StartAssignment_8 : ( RULE_STRING ) ;
    public final void rule__EVENT__StartAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1084:1: ( ( RULE_STRING ) )
            // InternalAgenda.g:1085:2: ( RULE_STRING )
            {
            // InternalAgenda.g:1085:2: ( RULE_STRING )
            // InternalAgenda.g:1086:3: RULE_STRING
            {
             before(grammarAccess.getEVENTAccess().getStartSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getStartSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__StartAssignment_8"


    // $ANTLR start "rule__EVENT__EndAssignment_10"
    // InternalAgenda.g:1095:1: rule__EVENT__EndAssignment_10 : ( RULE_STRING ) ;
    public final void rule__EVENT__EndAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1099:1: ( ( RULE_STRING ) )
            // InternalAgenda.g:1100:2: ( RULE_STRING )
            {
            // InternalAgenda.g:1100:2: ( RULE_STRING )
            // InternalAgenda.g:1101:3: RULE_STRING
            {
             before(grammarAccess.getEVENTAccess().getEndSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEVENTAccess().getEndSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__EndAssignment_10"


    // $ANTLR start "rule__TASK__NameAssignment_1"
    // InternalAgenda.g:1110:1: rule__TASK__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TASK__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1114:1: ( ( RULE_ID ) )
            // InternalAgenda.g:1115:2: ( RULE_ID )
            {
            // InternalAgenda.g:1115:2: ( RULE_ID )
            // InternalAgenda.g:1116:3: RULE_ID
            {
             before(grammarAccess.getTASKAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTASKAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__NameAssignment_1"


    // $ANTLR start "rule__TASK__RefEventAssignment_2_1"
    // InternalAgenda.g:1125:1: rule__TASK__RefEventAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TASK__RefEventAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1129:1: ( ( ( RULE_ID ) ) )
            // InternalAgenda.g:1130:2: ( ( RULE_ID ) )
            {
            // InternalAgenda.g:1130:2: ( ( RULE_ID ) )
            // InternalAgenda.g:1131:3: ( RULE_ID )
            {
             before(grammarAccess.getTASKAccess().getRefEventEVENTCrossReference_2_1_0()); 
            // InternalAgenda.g:1132:3: ( RULE_ID )
            // InternalAgenda.g:1133:4: RULE_ID
            {
             before(grammarAccess.getTASKAccess().getRefEventEVENTIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTASKAccess().getRefEventEVENTIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTASKAccess().getRefEventEVENTCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__RefEventAssignment_2_1"


    // $ANTLR start "rule__TASK__DeadlineAssignment_5"
    // InternalAgenda.g:1144:1: rule__TASK__DeadlineAssignment_5 : ( RULE_STRING ) ;
    public final void rule__TASK__DeadlineAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgenda.g:1148:1: ( ( RULE_STRING ) )
            // InternalAgenda.g:1149:2: ( RULE_STRING )
            {
            // InternalAgenda.g:1149:2: ( RULE_STRING )
            // InternalAgenda.g:1150:3: RULE_STRING
            {
             before(grammarAccess.getTASKAccess().getDeadlineSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTASKAccess().getDeadlineSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TASK__DeadlineAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000040C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});

}