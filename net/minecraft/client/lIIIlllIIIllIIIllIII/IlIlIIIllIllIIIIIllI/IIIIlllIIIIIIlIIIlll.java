package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import java.util.concurrent.*;

class IIIIlllIIIIIIlIIIlll implements Callable
{
    final /* synthetic */ IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ int[][] IlIlIlIlIlllllllllIl;
    
    IIIIlllIIIIIIlIIIlll(final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll, final int[][] ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        final StringBuilder sb = new StringBuilder();
        int[][] ilIlIlIlIlllllllllIl;
        for (int length = (ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl).length, i = 0; i < length; ++i) {
            final int[] array = ilIlIlIlIlllllllllIl[i];
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append((array == null) ? "null" : Integer.valueOf(array.length));
        }
        return sb.toString();
    }
}
