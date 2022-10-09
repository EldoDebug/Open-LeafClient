package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIlIIIllIIllIlllllI.*;
import com.google.common.collect.*;
import tv.twitch.chat.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class IllIIlllIIIIlllIIlIl extends lIIllIIIllllIlllIllI
{
    private static final IlllIIIIlIIIlIlIlIIl IlIlIIIllIllIIIIIllI;
    private static final IlllIIIIlIIIlIlIlIIl IllIIlllIIIIlllIIlIl;
    private static final IlllIIIIlIIIlIlIlIIl llllIIIlIlllIlIIIIIl;
    private final ChatUserInfo lIIIIlIIIIIlllIllIII;
    private final llIIIIIIlIllIIlIIIll lIIIlllIIIllIIIllIII;
    private final List llIIlIIIlIIIllIlIIIl;
    private final IlIlIIIllIIllIlllllI llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI;
        IllIIlllIIIIlllIIlIl = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI;
        llllIIIlIlllIlIIIIIl = IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl;
    }
    
    public IllIIlllIIIIlllIIlIl(final IlIlIIIllIIllIlllllI llIllIlIIIIllIlIIllI, final ChatUserInfo liiiIlIIIIIlllIllIII) {
        this.llIIlIIIlIIIllIlIIIl = Lists.newArrayList();
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = new IlIlIIIIIIlllIlIllIl(liiiIlIIIIIlllIllIII.displayName);
        this.llIIlIIIlIIIllIlIIIl.addAll(llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.modes, liiiIlIIIIIlllIllIII.subscriptions, llIllIlIIIIllIlIIllI));
    }
    
    public static List llllIIIIlIIIlIlllIll(final Set set, final Set set2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final String s = (ilIlIIIllIIllIlllllI == null) ? null : ilIlIIIllIIllIlllllI.IIIlIIlIIIIlllIlllII();
        final boolean b = ilIlIIIllIIllIlllllI != null && ilIlIIIllIIllIlllllI.IIlIIIIlllIlllllIlII();
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<ChatUserMode> iterator = set.iterator();
        while (iterator.hasNext()) {
            final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(iterator.next(), s, b);
            if (llllIIIIlIIIlIlllIll != null) {
                final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl("- ");
                ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                arrayList.add(ilIlIIIIIIlllIlIllIl);
            }
        }
        final Iterator<ChatUserSubscription> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(iterator2.next(), s, b);
            if (llllIIIIlIIIlIlllIll2 != null) {
                final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2 = new IlIlIIIIIIlllIlIllIl("- ");
                ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                arrayList.add(ilIlIIIIIIlllIlIllIl2);
            }
        }
        return arrayList;
    }
    
    public static llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final ChatUserSubscription chatUserSubscription, final String s, final boolean b) {
        llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = null;
        if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) {
            if (s == null) {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.subscription.subscriber", new Object[0]);
            }
            else if (b) {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.subscription.subscriber.self", new Object[0]);
            }
            else {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.subscription.subscriber.other", new Object[] { s });
            }
            llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
        }
        else if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO) {
            llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.subscription.turbo", new Object[0]);
            llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl);
        }
        return llIIIIIIlIllIIlIIIll;
    }
    
    public static llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final ChatUserMode chatUserMode, final String s, final boolean b) {
        llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = null;
        if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) {
            llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.administrator", new Object[0]);
            llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl);
        }
        else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BANNED) {
            if (s == null) {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.banned", new Object[0]);
            }
            else if (b) {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.banned.self", new Object[0]);
            }
            else {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.banned.other", new Object[] { s });
            }
            llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl);
        }
        else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER) {
            if (s == null) {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.broadcaster", new Object[0]);
            }
            else if (b) {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.broadcaster.self", new Object[0]);
            }
            else {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.broadcaster.other", new Object[0]);
            }
            llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
        }
        else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) {
            if (s == null) {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.moderator", new Object[0]);
            }
            else if (b) {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.moderator.self", new Object[0]);
            }
            else {
                llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.moderator.other", new Object[] { s });
            }
            llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
        }
        else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_STAFF) {
            llIIIIIIlIllIIlIIIll = new IIllIIllIIIlIlIIIIlI("stream.user.mode.staff", new Object[0]);
            llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl);
        }
        return llIIIIIIlIllIIlIIIll;
    }
    
    @Override
    public void n_() {
        final int n = this.llllIIllllIlIlIIIIll / 3;
        final int n2 = n - 130;
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, n * 0 + n2 / 2, this.IlIllIlIlIIIlIlIlIII - 70, 130, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stream.userinfo.timeout", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, n * 1 + n2 / 2, this.IlIllIlIlIIIlIlIlIII - 70, 130, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stream.userinfo.ban", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(2, n * 2 + n2 / 2, this.IlIllIlIlIIIlIlIlIII - 70, 130, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stream.userinfo.mod", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(5, n * 0 + n2 / 2, this.IlIllIlIlIIIlIlIlIII - 45, 130, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(3, n * 1 + n2 / 2, this.IlIllIlIlIIIlIlIlIII - 45, 130, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stream.userinfo.unban", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(4, n * 2 + n2 / 2, this.IlIllIlIlIIIlIlIlIII - 45, 130, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stream.userinfo.unmod", new Object[0])));
        int max = 0;
        final Iterator<llIIIIIIlIllIIlIIIll> iterator = this.llIIlIIIlIIIllIlIIIl.iterator();
        while (iterator.hasNext()) {
            max = Math.max(max, this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(iterator.next().lIIIlllIIIllIIIllIII()));
        }
        this.lIlIlIIIllIIllIIIllI = this.llllIIllllIlIlIIIIll / 2 - max / 2;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl("/ban " + this.lIIIIlIIIIIlllIllIII.displayName);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 3) {
                this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl("/unban " + this.lIIIIlIIIIIlllIllIII.displayName);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2) {
                this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl("/mod " + this.lIIIIlIIIIIlllIllIII.displayName);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 4) {
                this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl("/unmod " + this.lIIIIlIIIIIlllIllIII.displayName);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl("/timeout " + this.lIIIIlIIIIIlllIllIII.displayName);
            }
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.lIIIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII(), this.llllIIllllIlIlIIIIll / 2, 70, 16777215);
        int n4 = 80;
        final Iterator<llIIIIIIlIllIIlIIIll> iterator = this.llIIlIIIlIIIllIlIIIl.iterator();
        while (iterator.hasNext()) {
            this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, iterator.next().lIIIlllIIIllIIIllIII(), this.lIlIlIIIllIIllIIIllI, n4, 16777215);
            n4 += this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
