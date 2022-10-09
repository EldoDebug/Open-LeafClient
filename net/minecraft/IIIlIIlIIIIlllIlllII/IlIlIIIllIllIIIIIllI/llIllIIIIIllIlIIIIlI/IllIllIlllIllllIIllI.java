package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IllIllIlllIllllIIllI extends IIllllIIIlIIIIIIllIl
{
    public IllIllIIIIlIIlIlllII IlIlIlIlIlllllllllIl;
    public List llIllIIIIIllIlIIIIlI;
    public List IlIIIlIlIIIllIlIlIIl;
    public List lIIIIlIIIIIlllIllIII;
    
    public IllIllIlllIllllIIllI() {
        this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
    }
    
    public IllIllIlllIllllIIllI(final Random random, final int n, final int n2) {
        super(random, n, n2);
        this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        IllIllIIIIlIIlIlllII[] ilIlIlIlIlllllllllIl;
        for (int length = (ilIlIlIlIlllllllllIl = llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
            final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII = ilIlIlIlIlllllllllIl[i];
            illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = 0;
            this.llIllIIIIIllIlIIIIlI.add(illIllIIIIlIIlIlllII);
        }
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        IllIllIIIIlIIlIlllII[] llIllIIIIIllIlIIIIlI;
        for (int length2 = (llIllIIIIIllIlIIIIlI = llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl).length, j = 0; j < length2; ++j) {
            final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII2 = llIllIIIIIllIlIIIIlI[j];
            illIllIIIIlIIlIlllII2.llIllIIIIIllIlIIIIlI = 0;
            this.IlIIIlIlIIIllIlIlIIl.add(illIllIIIIlIIlIlllII2);
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
}
