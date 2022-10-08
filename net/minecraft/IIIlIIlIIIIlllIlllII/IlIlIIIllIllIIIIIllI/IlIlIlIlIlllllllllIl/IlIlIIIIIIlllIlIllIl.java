package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class IlIlIIIIIIlllIlIllIl extends llllIIIIlIIIlIlllIll
{
    private llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    
    public IlIlIIIIIIlllIlIllIl(final long n, final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI, final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl) {
        super(n);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final long n) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n);
        super.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int[] llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
        final int[] llllIIIIlIIIlIlllIll2 = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
        final int[] llllIIIIlIIIlIlllIll3 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n3 * n4; ++i) {
            if (llllIIIIlIIIlIlllIll[i] != llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII.lIIIIIlIlIIIlIIIIlIl && llllIIIIlIIIlIlllIll[i] != llIIlIIIlIIIllIlIIIl.IlllIIIIlIIIlIlIlIIl.lIIIIIlIlIIIlIIIIlIl) {
                if (llllIIIIlIIIlIlllIll2[i] == llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII.lIIIIIlIlIIIlIIIIlIl) {
                    if (llllIIIIlIIIlIlllIll[i] == llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl) {
                        llllIIIIlIIIlIlllIll3[i] = llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (llllIIIIlIIIlIlllIll[i] != llIIlIIIlIIIllIlIIIl.lIllllllIIllIlIlIlII.lIIIIIlIlIIIlIIIIlIl && llllIIIIlIIIlIlllIll[i] != llIIlIIIlIIIllIlIIIl.llIIlllIIlllIIllIllI.lIIIIIlIlIIIlIIIIlIl) {
                        llllIIIIlIIIlIlllIll3[i] = (llllIIIIlIIIlIlllIll2[i] & 0xFF);
                    }
                    else {
                        llllIIIIlIIIlIlllIll3[i] = llIIlIIIlIIIllIlIIIl.llIIlllIIlllIIllIllI.lIIIIIlIlIIIlIIIIlIl;
                    }
                }
                else {
                    llllIIIIlIIIlIlllIll3[i] = llllIIIIlIIIlIlllIll[i];
                }
            }
            else {
                llllIIIIlIIIlIlllIll3[i] = llllIIIIlIIIlIlllIll[i];
            }
        }
        return llllIIIIlIIIlIlllIll3;
    }
}
