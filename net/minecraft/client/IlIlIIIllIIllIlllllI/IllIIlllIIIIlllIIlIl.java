package net.minecraft.client.IlIlIIIllIIllIlllllI;

import org.apache.logging.log4j.*;
import tv.twitch.*;
import java.util.*;
import tv.twitch.chat.*;

public class IllIIlllIIIIlllIIlIl
{
    private static final Logger IIlllIIlIllIllIlIIll;
    protected lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll;
    protected String IlIlIlIlIlllllllllIl;
    protected String llIllIIIIIllIlIIIIlI;
    protected String IlIIIlIlIIIllIlIlIIl;
    protected Core IlIlIIIllIllIIIIIllI;
    protected Chat IllIIlllIIIIlllIIlIl;
    protected llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl;
    protected AuthToken lIIIIlIIIIIlllIllIII;
    protected HashMap lIIIlllIIIllIIIllIII;
    protected int llIIlIIIlIIIllIlIIIl;
    protected lIlIlIIIllIIllIIIllI llIllIlIIIIllIlIIllI;
    protected lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI;
    protected ChatEmoticonData IlIlIIIllIIllIlllllI;
    protected int IIIIlllIIIIIIlIIIlll;
    protected int llllIIllllIlIlIIIIll;
    protected IChatAPIListener IlIllIlIlIIIlIlIlIII;
    private static volatile /* synthetic */ int[] lllIIIIlllllIlIIllIl;
    
    static {
        IIlllIIlIllIllIlIIll = LogManager.getLogger();
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final AuthToken liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final String llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIlIlIlIlllllllllIl(final String ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final String s) {
        return this.lIIIlllIIIllIIIllIII.containsKey(s) && this.lIIIlllIIIllIIIllIII.get(s).llllIIIIlIIIlIlllIll() == net.minecraft.client.IlIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
    }
    
    public llIllIlIIIIllIlIIllI IlIIIlIlIIIllIlIlIIl(final String s) {
        if (!this.lIIIlllIIIllIIIllIII.containsKey(s)) {
            return net.minecraft.client.IlIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        }
        return this.lIIIlllIIIllIIIllIII.get(s).llllIIIIlIIIlIlllIll();
    }
    
    public IllIIlllIIIIlllIIlIl() {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = "";
        this.llIllIIIIIllIlIIIIlI = "";
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.IlIlIIIllIllIIIIIllI = null;
        this.IllIIlllIIIIlllIIlIl = null;
        this.llllIIIlIlllIlIIIIIl = net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;
        this.lIIIIlIIIIIlllIllIII = new AuthToken();
        this.lIIIlllIIIllIIIllIII = new HashMap();
        this.llIIlIIIlIIIllIlIIIl = 128;
        this.llIllIlIIIIllIlIIllI = net.minecraft.client.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll;
        this.lIlIlIIIllIIllIIIllI = net.minecraft.client.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIIllIlllllI = null;
        this.IIIIlllIIIIIIlIIIlll = 500;
        this.llllIIllllIlIlIIIIll = 2000;
        this.IlIllIlIlIIIlIlIlIII = (IChatAPIListener)new llllIIIlIlllIlIIIIIl(this);
        this.IlIlIIIllIllIIIIIllI = Core.getInstance();
        if (this.IlIlIIIllIllIIIIIllI == null) {
            this.IlIlIIIllIllIIIIIllI = new Core((CoreAPI)new StandardCoreAPI());
        }
        this.IllIIlllIIIIlllIIlIl = new Chat((ChatAPI)new StandardChatAPI());
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        if (this.llllIIIlIlllIlIIIIIl != net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl);
        final ErrorCode initialize = this.IlIlIIIllIllIIIIIllI.initialize(this.llIllIIIIIllIlIIIIlI, (String)null);
        if (ErrorCode.failed(initialize)) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
            this.llllIIIlIlllIlIIIIIl(String.format("Error initializing Twitch sdk: %s", ErrorCode.getString(initialize)));
            return false;
        }
        this.lIlIlIIIllIIllIIIllI = this.llIllIlIIIIllIlIIllI;
        final HashSet<ChatTokenizationOption> set = new HashSet<ChatTokenizationOption>();
        switch (lIIIlllIIIllIIIllIII()[this.llIllIlIIIIllIlIIllI.ordinal()]) {
            case 1: {
                set.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_NONE);
                break;
            }
            case 2: {
                set.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_URLS);
                break;
            }
            case 3: {
                set.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_TEXTURES);
                break;
            }
        }
        final ErrorCode initialize2 = this.IllIIlllIIIIlllIIlIl.initialize((HashSet)set, this.IlIllIlIlIIIlIlIlIII);
        if (ErrorCode.failed(initialize2)) {
            this.IlIlIIIllIllIIIIIllI.shutdown();
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
            this.llllIIIlIlllIlIIIIIl(String.format("Error initializing Twitch chat: %s", ErrorCode.getString(initialize2)));
            return false;
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI);
        return true;
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final String s) {
        return this.llllIIIIlIIIlIlllIll(s, false);
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        if (this.llllIIIlIlllIlIIIIIl != net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) {
            return false;
        }
        if (this.lIIIlllIIIllIIIllIII.containsKey(s)) {
            this.llllIIIlIlllIlIIIIIl("Already in channel: " + s);
            return false;
        }
        if (s != null && !s.equals("")) {
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII(this, s);
            this.lIIIlllIIIllIIIllIII.put(s, liiiIlIIIIIlllIllIII);
            final boolean llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(b);
            if (!llllIIIIlIIIlIlllIll) {
                this.lIIIlllIIIllIIIllIII.remove(s);
            }
            return llllIIIIlIIIlIlllIll;
        }
        return false;
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final String s) {
        if (this.llllIIIlIlllIlIIIIIl != net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) {
            return false;
        }
        if (!this.lIIIlllIIIllIIIllIII.containsKey(s)) {
            this.llllIIIlIlllIlIIIIIl("Not in channel: " + s);
            return false;
        }
        return this.lIIIlllIIIllIIIllIII.get(s).IlIlIlIlIlllllllllIl();
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        if (this.llllIIIlIlllIlIIIIIl != net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) {
            return false;
        }
        final ErrorCode shutdown = this.IllIIlllIIIIlllIIlIl.shutdown();
        if (ErrorCode.failed(shutdown)) {
            this.llllIIIlIlllIlIIIIIl(String.format("Error shutting down chat: %s", ErrorCode.getString(shutdown)));
            return false;
        }
        this.lIIIIlIIIIIlllIllIII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl);
        return true;
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIIlIIIlIlllIll() != net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll) {
            this.llIllIIIIIllIlIIIIlI();
            if (this.llllIIIIlIIIlIlllIll() == net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl) {
                while (this.llllIIIIlIIIlIlllIll() != net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll) {
                    try {
                        Thread.sleep(200L);
                        this.IlIlIIIllIllIIIIIllI();
                    }
                    catch (InterruptedException ex) {}
                }
            }
        }
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        if (this.llllIIIlIlllIlIIIIIl != net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll) {
            final ErrorCode flushEvents = this.IllIIlllIIIIlllIIlIl.flushEvents();
            if (ErrorCode.failed(flushEvents)) {
                this.llllIIIlIlllIlIIIIIl(String.format("Error flushing chat events: %s", ErrorCode.getString(flushEvents)));
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final String s2) {
        if (this.llllIIIlIlllIlIIIIIl != net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) {
            return false;
        }
        if (!this.lIIIlllIIIllIIIllIII.containsKey(s)) {
            this.llllIIIlIlllIlIIIIIl("Not in channel: " + s);
            return false;
        }
        return this.lIIIlllIIIllIIIllIII.get(s).IlIlIlIlIlllllllllIl(s2);
    }
    
    protected void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIlIlllIlIIIIIl != this.llllIIIlIlllIlIIIIIl) {
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            try {
                if (this.llllIIIIlIIIlIlllIll != null) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
                }
            }
            catch (Exception ex) {
                this.llllIIIlIlllIlIIIIIl(ex.toString());
            }
        }
    }
    
    protected void IllIIlllIIIIlllIIlIl() {
        if (this.lIlIlIIIllIIllIIIllI != net.minecraft.client.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll && this.IlIlIIIllIIllIlllllI == null) {
            final ErrorCode downloadEmoticonData = this.IllIIlllIIIIlllIIlIl.downloadEmoticonData();
            if (ErrorCode.failed(downloadEmoticonData)) {
                this.llllIIIlIlllIlIIIIIl(String.format("Error trying to download emoticon data: %s", ErrorCode.getString(downloadEmoticonData)));
            }
        }
    }
    
    protected void llllIIIlIlllIlIIIIIl() {
        if (this.IlIlIIIllIIllIlllllI == null) {
            this.IlIlIIIllIIllIlllllI = new ChatEmoticonData();
            final ErrorCode emoticonData = this.IllIIlllIIIIlllIIlIl.getEmoticonData(this.IlIlIIIllIIllIlllllI);
            if (ErrorCode.succeeded(emoticonData)) {
                try {
                    if (this.llllIIIIlIIIlIlllIll != null) {
                        this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
                    }
                }
                catch (Exception ex) {
                    this.llllIIIlIlllIlIIIIIl(ex.toString());
                }
            }
            else {
                this.llllIIIlIlllIlIIIIIl("Error preparing emoticon data: " + ErrorCode.getString(emoticonData));
            }
        }
    }
    
    protected void lIIIIlIIIIIlllIllIII() {
        if (this.IlIlIIIllIIllIlllllI != null) {
            final ErrorCode clearEmoticonData = this.IllIIlllIIIIlllIIlIl.clearEmoticonData();
            if (ErrorCode.succeeded(clearEmoticonData)) {
                this.IlIlIIIllIIllIlllllI = null;
                try {
                    if (this.llllIIIIlIIIlIlllIll != null) {
                        this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
                    }
                }
                catch (Exception ex) {
                    this.llllIIIlIlllIlIIIIIl(ex.toString());
                }
            }
            else {
                this.llllIIIlIlllIlIIIIIl("Error clearing emoticon data: " + ErrorCode.getString(clearEmoticonData));
            }
        }
    }
    
    protected void llllIIIlIlllIlIIIIIl(final String s) {
        net.minecraft.client.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.error(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "[Chat controller] {}", new Object[] { s });
    }
    
    static /* synthetic */ int[] lIIIlllIIIllIIIllIII() {
        final int[] lllIIIIlllllIlIIllIl = IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl;
        if (lllIIIIlllllIlIIllIl != null) {
            return lllIIIIlllllIlIIllIl;
        }
        final int[] lllIIIIlllllIlIIllIl2 = new int[lIlIlIIIllIIllIIIllI.values().length];
        try {
            lllIIIIlllllIlIIllIl2[lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIIIIlllllIlIIllIl2[lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIIIIlllllIlIIllIl2[lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl2;
    }
}
