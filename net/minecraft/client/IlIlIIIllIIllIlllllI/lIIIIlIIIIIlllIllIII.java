package net.minecraft.client.IlIlIIIllIIllIlllllI;

import com.google.common.collect.*;
import tv.twitch.*;
import java.util.*;
import tv.twitch.chat.*;

public class lIIIIlIIIIIlllIllIII implements IChatChannelListener
{
    protected String llllIIIIlIIIlIlllIll;
    protected boolean IlIlIlIlIlllllllllIl;
    protected llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI;
    protected List IlIIIlIlIIIllIlIlIIl;
    protected LinkedList IlIlIIIllIllIIIIIllI;
    protected LinkedList IllIIlllIIIIlllIIlIl;
    protected ChatBadgeData llllIIIlIlllIlIIIIIl;
    final /* synthetic */ IllIIlllIIIIlllIIlIl lIIIIlIIIIIlllIllIII;
    private static volatile /* synthetic */ int[] lIIIlllIIIllIIIllIII;
    private static volatile /* synthetic */ int[] llIIlIIIlIIIllIlIIIl;
    
    public lIIIIlIIIIIlllIllIII(final IllIIlllIIIIlllIIlIl liiiIlIIIIIlllIllIII, final String llllIIIIlIIIlIlllIll) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = false;
        this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = new LinkedList();
        this.IllIIlllIIIIlllIIlIl = new LinkedList();
        this.llllIIIlIlllIlIIIIIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final boolean ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        final ErrorCode ttv_EC_SUCCESS = ErrorCode.TTV_EC_SUCCESS;
        ErrorCode errorCode;
        if (ilIlIlIlIlllllllllIl) {
            errorCode = this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl.connectAnonymous(this.llllIIIIlIIIlIlllIll, (IChatChannelListener)this);
        }
        else {
            errorCode = this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl.connect(this.llllIIIIlIIIlIlllIll, this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl, this.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.data, (IChatChannelListener)this);
        }
        if (ErrorCode.failed(errorCode)) {
            this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(String.format("Error connecting: %s", ErrorCode.getString(errorCode)));
            this.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll);
            return false;
        }
        this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI();
        return true;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        switch (IllIIlllIIIIlllIIlIl()[this.llIllIIIIIllIlIIIIlI.ordinal()]) {
            case 2:
            case 3: {
                final ErrorCode disconnect = this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl.disconnect(this.llllIIIIlIIIlIlllIll);
                if (ErrorCode.failed(disconnect)) {
                    this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(String.format("Error disconnecting: %s", ErrorCode.getString(disconnect)));
                    return false;
                }
                this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl);
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI != this.llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        if (this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI == lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll) {
            this.IlIlIIIllIllIIIIIllI.clear();
            this.IllIIlllIIIIlllIIlIl.clear();
        }
        else {
            if (this.IlIlIIIllIllIIIIIllI.size() > 0) {
                final ListIterator listIterator = this.IlIlIIIllIllIIIIIllI.listIterator();
                while (listIterator.hasNext()) {
                    if (listIterator.next().userName.equals(s)) {
                        listIterator.remove();
                    }
                }
            }
            if (this.IllIIlllIIIIlllIIlIl.size() > 0) {
                final ListIterator listIterator2 = this.IllIIlllIIIIlllIIlIl.listIterator();
                while (listIterator2.hasNext()) {
                    if (listIterator2.next().displayName.equals(s)) {
                        listIterator2.remove();
                    }
                }
            }
        }
        try {
            if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll != null) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, s);
            }
        }
        catch (Exception ex) {
            this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ex.toString());
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        if (this.llIllIIIIIllIlIIIIlI != llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI) {
            return false;
        }
        final ErrorCode sendMessage = this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl.sendMessage(this.llllIIIIlIIIlIlllIll, s);
        if (ErrorCode.failed(sendMessage)) {
            this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(String.format("Error sending chat message: %s", ErrorCode.getString(sendMessage)));
            return false;
        }
        return true;
    }
    
    protected void llIllIIIIIllIlIIIIlI() {
        if (this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI != lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll && this.llllIIIlIlllIlIIIIIl == null) {
            final ErrorCode downloadBadgeData = this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl.downloadBadgeData(this.llllIIIIlIIIlIlllIll);
            if (ErrorCode.failed(downloadBadgeData)) {
                this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(String.format("Error trying to download badge data: %s", ErrorCode.getString(downloadBadgeData)));
            }
        }
    }
    
    protected void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            this.llllIIIlIlllIlIIIIIl = new ChatBadgeData();
            final ErrorCode badgeData = this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl.getBadgeData(this.llllIIIIlIIIlIlllIll, this.llllIIIlIlllIlIIIIIl);
            if (ErrorCode.succeeded(badgeData)) {
                try {
                    if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll != null) {
                        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll);
                    }
                }
                catch (Exception ex) {
                    this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ex.toString());
                }
            }
            else {
                this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl("Error preparing badge data: " + ErrorCode.getString(badgeData));
            }
        }
    }
    
    protected void IlIlIIIllIllIIIIIllI() {
        if (this.llllIIIlIlllIlIIIIIl != null) {
            final ErrorCode clearBadgeData = this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl.clearBadgeData(this.llllIIIIlIIIlIlllIll);
            if (ErrorCode.succeeded(clearBadgeData)) {
                this.llllIIIlIlllIlIIIIIl = null;
                try {
                    if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll != null) {
                        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll);
                    }
                }
                catch (Exception ex) {
                    this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ex.toString());
                }
            }
            else {
                this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl("Error releasing badge data: " + ErrorCode.getString(clearBadgeData));
            }
        }
    }
    
    protected void llIllIIIIIllIlIIIIlI(final String s) {
        try {
            if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll != null) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
            }
        }
        catch (Exception ex) {
            this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ex.toString());
        }
    }
    
    protected void IlIIIlIlIIIllIlIlIIl(final String s) {
        try {
            if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll != null) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s);
            }
        }
        catch (Exception ex) {
            this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ex.toString());
        }
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        if (this.llIllIIIIIllIlIIIIlI != llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI) {
            this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI);
            this.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll);
            this.IlIlIIIllIllIIIIIllI();
        }
    }
    
    public void chatStatusCallback(final String s, final ErrorCode errorCode) {
        if (!ErrorCode.succeeded(errorCode)) {
            this.lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII.remove(s);
            this.lIIIIlIIIIIlllIllIII();
        }
    }
    
    public void chatChannelMembershipCallback(final String s, final ChatEvent chatEvent, final ChatChannelInfo chatChannelInfo) {
        switch (llllIIIlIlllIlIIIIIl()[chatEvent.ordinal()]) {
            case 1: {
                this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI);
                this.llIllIIIIIllIlIIIIlI(s);
                break;
            }
            case 2: {
                this.lIIIIlIIIIIlllIllIII();
                break;
            }
        }
    }
    
    public void chatChannelUserChangeCallback(final String s, final ChatUserInfo[] array, final ChatUserInfo[] array2, final ChatUserInfo[] array3) {
        for (int i = 0; i < array2.length; ++i) {
            final int index = this.IlIIIlIlIIIllIlIlIIl.indexOf(array2[i]);
            if (index >= 0) {
                this.IlIIIlIlIIIllIlIlIIl.remove(index);
            }
        }
        for (int j = 0; j < array3.length; ++j) {
            final int index2 = this.IlIIIlIlIIIllIlIlIIl.indexOf(array3[j]);
            if (index2 >= 0) {
                this.IlIIIlIlIIIllIlIlIIl.remove(index2);
            }
            this.IlIIIlIlIIIllIlIlIIl.add(array3[j]);
        }
        for (int k = 0; k < array.length; ++k) {
            this.IlIIIlIlIIIllIlIlIIl.add(array[k]);
        }
        try {
            if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll != null) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, array, array2, array3);
            }
        }
        catch (Exception ex) {
            this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ex.toString());
        }
    }
    
    public void chatChannelRawMessageCallback(final String s, final ChatRawMessage[] array) {
        for (int i = 0; i < array.length; ++i) {
            this.IlIlIIIllIllIIIIIllI.addLast(array[i]);
        }
        try {
            if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll != null) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, array);
            }
        }
        catch (Exception ex) {
            this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ex.toString());
        }
        while (this.IlIlIIIllIllIIIIIllI.size() > this.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl) {
            this.IlIlIIIllIllIIIIIllI.removeFirst();
        }
    }
    
    public void chatChannelTokenizedMessageCallback(final String s, final ChatTokenizedMessage[] array) {
        for (int i = 0; i < array.length; ++i) {
            this.IllIIlllIIIIlllIIlIl.addLast(array[i]);
        }
        try {
            if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll != null) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, array);
            }
        }
        catch (Exception ex) {
            this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ex.toString());
        }
        while (this.IllIIlllIIIIlllIIlIl.size() > this.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl) {
            this.IllIIlllIIIIlllIIlIl.removeFirst();
        }
    }
    
    public void chatClearCallback(final String s, final String s2) {
        this.llllIIIIlIIIlIlllIll(s2);
    }
    
    public void chatBadgeDataDownloadCallback(final String s, final ErrorCode errorCode) {
        if (ErrorCode.succeeded(errorCode)) {
            this.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    static /* synthetic */ int[] IllIIlllIIIIlllIIlIl() {
        final int[] liiIlllIIIllIIIllIII = lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII;
        if (liiIlllIIIllIIIllIII != null) {
            return liiIlllIIIllIIIllIII;
        }
        final int[] liiIlllIIIllIIIllIII2 = new int[llIllIlIIIIllIlIIllI.values().length];
        try {
            liiIlllIIIllIIIllIII2[llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            liiIlllIIIllIIIllIII2[llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            liiIlllIIIllIIIllIII2[llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            liiIlllIIIllIIIllIII2[llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            liiIlllIIIllIIIllIII2[llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII2;
    }
    
    static /* synthetic */ int[] llllIIIlIlllIlIIIIIl() {
        final int[] llIIlIIIlIIIllIlIIIl = lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl;
        if (llIIlIIIlIIIllIlIIIl != null) {
            return llIIlIIIlIIIllIlIIIl;
        }
        final int[] llIIlIIIlIIIllIlIIIl2 = new int[ChatEvent.values().length];
        try {
            llIIlIIIlIIIllIlIIIl2[ChatEvent.TTV_CHAT_JOINED_CHANNEL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIIlIIIlIIIllIlIIIl2[ChatEvent.TTV_CHAT_LEFT_CHANNEL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        return lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl2;
    }
}
