package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class j implements IIIIIIIIIlllIllIlIlI
{
    private final Minecraft llllIIIIlIIIlIlllIll;
    
    public j() {
        this.llllIIIIlIIIlIlllIll = Minecraft.getMinecraft();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b) {
        final int n8 = n3 + n5 / 2 - this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll / 2;
        this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("lanServer.scanning", new Object[0]), this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll / 2 - this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("lanServer.scanning", new Object[0])) / 2, n8, 16777215);
        String s = null;
        switch ((int)(Minecraft.IIIllllllIllIIIlllIl() / 300L % 4L)) {
            default: {
                s = "O o o";
                break;
            }
            case 1:
            case 3: {
                s = "o O o";
                break;
            }
            case 2: {
                s = "o o O";
                break;
            }
        }
        this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll / 2 - this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s) / 2, n8 + this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll, 8421504);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
    }
}
