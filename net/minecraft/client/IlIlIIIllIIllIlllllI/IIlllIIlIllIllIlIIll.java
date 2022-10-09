package net.minecraft.client.IlIlIIIllIIllIlllllI;

import tv.twitch.broadcast.*;

class IIlllIIlIllIllIlIIll implements IStatCallbacks
{
    final /* synthetic */ llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    private static volatile /* synthetic */ int[] IlIlIlIlIlllllllllIl;
    
    IIlllIIlIllIllIlIIll(final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void statCallback(final StatType statType, final long llllIIIlIlllIlIIIIIl) {
        switch (llllIIIIlIIIlIlllIll()[statType.ordinal()]) {
            case 1: {
                this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = RTMPState.lookupValue((int)llllIIIlIlllIlIIIIIl);
                break;
            }
            case 2: {
                this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
                break;
            }
        }
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] ilIlIlIlIlllllllllIl = IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        final int[] ilIlIlIlIlllllllllIl2 = new int[StatType.values().length];
        try {
            ilIlIlIlIlllllllllIl2[StatType.TTV_ST_RTMPDATASENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIlIlIlllllllllIl2[StatType.TTV_ST_RTMPSTATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        return IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
    }
}
