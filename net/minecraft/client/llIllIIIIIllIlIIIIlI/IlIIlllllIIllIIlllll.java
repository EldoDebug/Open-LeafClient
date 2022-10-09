package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import org.lwjgl.input.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class IlIIlllllIIllIIlllll extends lIIllIIIllllIlllIllI
{
    private lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private lIIlIIIIIIIlIIlIlIIl IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    
    public IlIIlllllIIllIIlllll(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI, final String llllIIIlIlllIlIIIIIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void n_() {
        Keyboard.enableRepeatEvents(true);
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 96 + 12, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.renameButton", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 120 + 12, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        final String llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl().llIllIIIIIllIlIIIIlI(this.llllIIIlIlllIlIIIIIl).llIIlIIIlIIIllIlIIIl();
        (this.IllIIlllIIIIlllIIlIl = new lIIlIIIIIIIlIIlIlIIl(2, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 100, 60, 200, 20)).IlIlIlIlIlllllllllIl(true);
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().trim());
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(c, n);
        this.IIlllIIlIllIllIlIIll.get(0).lIlIlIIIllIIllIIIllI = (this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().trim().length() > 0);
        if (n == 28 || n == 156) {
            this.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll.get(0));
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.renameTitle", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.enterName", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 100, 47, 10526880);
        this.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl();
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
