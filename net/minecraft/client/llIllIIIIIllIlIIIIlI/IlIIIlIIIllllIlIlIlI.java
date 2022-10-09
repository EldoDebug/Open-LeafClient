package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.*;

public class IlIIIlIIIllllIlIlIlI extends IlIIIlIlIIIllIlIlIIl
{
    private boolean llllIIllllIlIlIIIIll;
    private String IlIllIlIlIIIlIlIlIII;
    private final lIlIIlllIIlIIlIlllIl IIlllIIlIllIllIlIIll;
    
    public IlIIIlIIIllllIlIlIlI(final lIlIIlllIIlIIlIlllIl iIlllIIlIllIllIlIIll, final int n, final int n2, final int n3, final String ilIllIlIlIIIlIlIlIII, final boolean llllIIllllIlIlIIIIll) {
        super(n, n2, n3, 150, 20, "");
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.llIIlIIIlIIIllIlIIIl = this.llIllIIIIIllIlIIIIlI();
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    private String llIllIIIIIllIlIIIIlI() {
        return String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII, new Object[0])) + ": " + (this.llllIIllllIlIlIIIIll ? net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.yes", new Object[0]) : net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.no", new Object[0]));
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.llIIlIIIlIIIllIlIIIl = this.llIllIIIIIllIlIIIIlI();
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, llllIIllllIlIlIIIIll);
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final Minecraft minecraft, final int n, final int n2) {
        if (super.llIllIIIIIllIlIIIIlI(minecraft, n, n2)) {
            this.llllIIllllIlIlIIIIll = !this.llllIIllllIlIlIIIIll;
            this.llIIlIIIlIIIllIlIIIl = this.llIllIIIIIllIlIIIIlI();
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.llllIIllllIlIlIIIIll);
            return true;
        }
        return false;
    }
}
