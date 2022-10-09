package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.nio.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;
import org.lwjgl.opengl.*;
import java.util.*;

public class llIIIllIlIllIllIIIIl extends lllIIIIlllllIlIIllIl
{
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    IntBuffer llIllIIIIIllIlIIIIlI;
    
    public llIIIllIlIllIllIIIIl() {
        this.llIllIIIIIllIlIIIIlI = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl(16);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        if (this.IlIlIlIlIlllllllllIl) {
            if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.D()) {
                for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII : this.llllIIIIlIIIlIlllIll) {
                    final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = (llllIIllllIlIlIIIIll)ilIllIlIlIIIlIlIlIII;
                    lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                    this.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII);
                    GL11.glCallList(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII, llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl()));
                    lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                }
            }
            else {
                int ilIlIIIllIllIIIIIllI = Integer.MIN_VALUE;
                int illIIlllIIIIlllIIlIl = Integer.MIN_VALUE;
                for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2 : this.llllIIIIlIIIlIlllIll) {
                    final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll2 = (llllIIllllIlIlIIIIll)ilIllIlIlIIIlIlIlIII2;
                    if (ilIlIIIllIllIIIIIllI != ilIllIlIlIIIlIlIlIII2.IlIlIIIllIllIIIIIllI || illIIlllIIIIlllIIlIl != ilIllIlIlIIIlIlIlIII2.IllIIlllIIIIlllIIlIl) {
                        if (this.llIllIIIIIllIlIIIIlI.position() > 0) {
                            this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, illIIlllIIIIlllIIlIl, this.llIllIIIIIllIlIIIIlI);
                        }
                        ilIlIIIllIllIIIIIllI = ilIllIlIlIIIlIlIlIII2.IlIlIIIllIllIIIIIllI;
                        illIIlllIIIIlllIIlIl = ilIllIlIlIIIlIlIlIII2.IllIIlllIIIIlllIIlIl;
                    }
                    if (this.llIllIIIIIllIlIIIIlI.position() >= this.llIllIIIIIllIlIIIIlI.capacity()) {
                        final IntBuffer ilIIIlIlIIIllIlIlIIl = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI.capacity() * 2);
                        this.llIllIIIIIllIlIIIIlI.flip();
                        ilIIIlIlIIIllIlIlIIl.put(this.llIllIIIIIllIlIIIIlI);
                        this.llIllIIIIIllIlIIIIlI = ilIIIlIlIIIllIlIlIIl;
                    }
                    this.llIllIIIIIllIlIIIIlI.put(llllIIllllIlIlIIIIll2.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII, llllIIllllIlIlIIIIll2.llllIIIlIlllIlIIIIIl()));
                }
                if (this.llIllIIIIIllIlIIIIlI.position() > 0) {
                    this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, illIIlllIIIIlllIIlIl, this.llIllIIIIIllIlIIIIlI);
                }
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII()) {
                lllllIlIIIlIlIIlllII.IlIIIlIIIllllIlIlIlI();
            }
            lllllIlIIIlIlIIlllII.llIIlllIIlllIIllIllI();
            this.llllIIIIlIIIlIlllIll.clear();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI, final double illIIlllIIIIlllIIlIl) {
        super.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl);
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final IntBuffer intBuffer) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        this.llllIIIIlIIIlIlllIll(n, 0, n2);
        intBuffer.flip();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(intBuffer);
        intBuffer.clear();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(n - this.IlIIIlIlIIIllIlIlIIl), (float)(n2 - this.IlIlIIIllIllIIIIIllI), (float)(n3 - this.IllIIlllIIIIlllIIlIl));
    }
}
