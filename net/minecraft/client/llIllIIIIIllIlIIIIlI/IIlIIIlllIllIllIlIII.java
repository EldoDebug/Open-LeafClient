package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import com.google.common.collect.*;

public class IIlIIIlllIllIllIlIII extends IIIIIllIIIIlIIIIllIl
{
    private final List llllIIIIlIIIlIlllIll;
    
    public IIlIIIlllIllIllIlIII(final Minecraft minecraft, final int n, final int n2, final int n3, final int n4, final int n5, final llIllIIIIIllIlIIIIlI... array) {
        super(minecraft, n, n2, n3, n4, n5);
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.IlIlIIIllIIllIlllllI = false;
        for (int i = 0; i < array.length; i += 2) {
            this.llllIIIIlIIIlIlllIll.add(new lIlIlIlllIIlIlIlllIl(this.llllIIIIlIIIlIlllIll(minecraft, n / 2 - 155, 0, array[i]), this.llllIIIIlIIIlIlllIll(minecraft, n / 2 - 155 + 160, 0, (i < array.length - 1) ? array[i + 1] : null)));
        }
    }
    
    private IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI == null) {
            return null;
        }
        final int llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() ? new IlIIlIlIIIlIIlIlIlII(llIllIIIIIllIlIIIIlI2, n, n2, llIllIIIIIllIlIIIIlI) : new llIlIIIIIlIIlIlIIlll(llIllIIIIIllIlIIIIlI2, n, n2, llIllIIIIIllIlIIIIlI, minecraft.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI));
    }
    
    public lIlIlIlllIIlIlIlllIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.llllIIIIlIIIlIlllIll.get(n);
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.size();
    }
    
    @Override
    public int m_() {
        return 400;
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return super.llllIIIlIlllIlIIIIIl() + 32;
    }
}
