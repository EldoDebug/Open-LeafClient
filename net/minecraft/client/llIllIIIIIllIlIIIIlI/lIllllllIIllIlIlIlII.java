package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import org.apache.commons.lang3.*;
import java.util.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class lIllllllIIllIlIlIlII extends IIIIIllIIIIlIIIIllIl
{
    private final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll;
    private final Minecraft IlIlIlIlIlllllllllIl;
    private final IIIIIIIIIlllIllIlIlI[] IlllllllIIIlIIIlIlII;
    private int IIlIIIIlllIlllllIlII;
    
    public lIllllllIIllIlIlIlII(final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll, final Minecraft ilIlIlIlIlllllllllIl) {
        super(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, 63, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII - 32, 20);
        this.IIlIIIIlllIlllllIlII = 0;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        final IlIIIlIlIIIllIlIlIIl[] array = (IlIIIlIlIIIllIlIlIIl[])ArrayUtils.clone((Object[])ilIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll.lllllIIIIIlIIlllIlIl);
        this.IlllllllIIIlIIIlIlII = new IIIIIIIIIlllIllIlIlI[array.length + net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI().size()];
        Arrays.sort(array);
        int n = 0;
        Object o = null;
        IlIIIlIlIIIllIlIlIIl[] array2;
        for (int length = (array2 = array).length, i = 0; i < length; ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = array2[i];
            final String ilIlIIIllIllIIIIIllI = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI();
            if (!ilIlIIIllIllIIIIIllI.equals(o)) {
                o = ilIlIIIllIllIIIIIllI;
                this.IlllllllIIIlIIIlIlII[n++] = new llIIlllIIlllIIllIllI(this, ilIlIIIllIllIIIIIllI);
            }
            final int llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl(), new Object[0]));
            if (llllIIIIlIIIlIlllIll2 > this.IIlIIIIlllIlllllIlII) {
                this.IIlIIIIlllIlllllIlII = llllIIIIlIIIlIlllIll2;
            }
            this.IlllllllIIIlIIIlIlII[n++] = new IIlllIIIlIlllIIlllII(this, ilIIIlIlIIIllIlIlIIl, null);
        }
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.IlllllllIIIlIIIlIlII.length;
    }
    
    @Override
    public IIIIIIIIIlllIllIlIlI IlIlIlIlIlllllllllIl(final int n) {
        return this.IlllllllIIIlIIIlIlII[n];
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return super.llllIIIlIlllIlIIIIIl() + 15;
    }
    
    @Override
    public int m_() {
        return super.m_() + 32;
    }
}
