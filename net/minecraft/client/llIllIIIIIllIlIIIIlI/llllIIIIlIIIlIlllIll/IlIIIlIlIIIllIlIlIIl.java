package net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.input.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;

abstract class IlIIIlIlIIIllIlIlIIl extends lllIIIIlIlIllIIlIIIl
{
    protected int llllIIIIlIIIlIlllIll;
    protected List IlIlIlIlIlllllllllIl;
    protected Comparator IlllllllIIIlIIIlIlII;
    protected int IIlIIIIlllIlllllIlII;
    protected int IIIlIIlIIIIlllIlllII;
    final /* synthetic */ llIllIIIIIllIlIIIIlI IlIlIllllllllIIIIlII;
    
    protected IlIIIlIlIIIllIlIlIIl(final llIllIIIIIllIlIIIIlI ilIlIllllllllIIIIlII, final Minecraft minecraft) {
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
        super(minecraft, ilIlIllllllllIIIIlII.llllIIllllIlIlIIIIll, ilIlIllllllllIIIIlII.IlIllIlIlIIIlIlIlIII, 32, ilIlIllllllllIIIIlII.IlIllIlIlIIIlIlIlIII - 64, 20);
        this.llllIIIIlIIIlIlllIll = -1;
        this.IIlIIIIlllIlllllIlII = -1;
        this.IlIlIlIlIlllllllllIl(false);
        this.llllIIIIlIIIlIlllIll(true, 20);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final boolean b, final int n2, final int n3) {
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return false;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.IlIlIllllllllIIIIlII.IlIlIIIllIIllIlllllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII) {
        if (!Mouse.isButtonDown(0)) {
            this.llllIIIIlIIIlIlllIll = -1;
        }
        if (this.llllIIIIlIIIlIlllIll == 0) {
            this.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(n + 115 - 18, n2 + 1, 0, 0);
        }
        else {
            this.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(n + 115 - 18, n2 + 1, 0, 18);
        }
        if (this.llllIIIIlIIIlIlllIll == 1) {
            this.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(n + 165 - 18, n2 + 1, 0, 0);
        }
        else {
            this.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(n + 165 - 18, n2 + 1, 0, 18);
        }
        if (this.llllIIIIlIIIlIlllIll == 2) {
            this.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(n + 215 - 18, n2 + 1, 0, 0);
        }
        else {
            this.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(n + 215 - 18, n2 + 1, 0, 18);
        }
        if (this.IIlIIIIlllIlllllIlII != -1) {
            int n3 = 79;
            int n4 = 18;
            if (this.IIlIIIIlllIlllllIlII == 1) {
                n3 = 129;
            }
            else if (this.IIlIIIIlllIlllllIlII == 2) {
                n3 = 179;
            }
            if (this.IIIlIIlIIIIlllIlllII == 1) {
                n4 = 36;
            }
            this.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(n + n3, n2 + 1, n4, 0);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll = -1;
        if (n >= 79 && n < 115) {
            this.llllIIIIlIIIlIlllIll = 0;
        }
        else if (n >= 129 && n < 165) {
            this.llllIIIIlIIIlIlllIll = 1;
        }
        else if (n >= 179 && n < 215) {
            this.llllIIIIlIIIlIlllIll = 2;
        }
        if (this.llllIIIIlIIIlIlllIll >= 0) {
            this.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll);
            this.llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(net.minecraft.client.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("gui.button.press"), 1.0f));
        }
    }
    
    @Override
    protected final int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.size();
    }
    
    protected final net.minecraft.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl(final int n) {
        return this.IlIlIlIlIlllllllllIl.get(n);
    }
    
    protected abstract String llIllIIIIIllIlIIIIlI(final int p0);
    
    protected void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2, final boolean b) {
        if (illIIlllIIIIlllIIlIl != null) {
            final String llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.IlIlIllllllllIIIIlII.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl));
            this.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl(this.IlIlIllllllllIIIIlII.IIllIIllIIIlIlIIIIlI, llllIIIIlIIIlIlllIll, n - this.IlIlIllllllllIIIIlII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), n2 + 5, b ? 16777215 : 9474192);
        }
        else {
            final String s = "-";
            this.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl(this.IlIlIllllllllIIIIlII.IIllIIllIIIlIlIIIIlI, s, n - this.IlIlIllllllllIIIIlII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s), n2 + 5, b ? 16777215 : 9474192);
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (n2 >= this.IllIIlllIIIIlllIIlIl && n2 <= this.llllIIIlIlllIlIIIIIl) {
            final int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(n, n2);
            final int n3 = this.IlIIIlIlIIIllIlIlIIl / 2 - 92 - 16;
            if (llIllIIIIIllIlIIIIlI >= 0) {
                if (n < n3 + 40 || n > n3 + 40 + 20) {
                    return;
                }
                this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI), n, n2);
            }
            else {
                String s;
                if (n >= n3 + 115 - 18 && n <= n3 + 115) {
                    s = this.llIllIIIIIllIlIIIIlI(0);
                }
                else if (n >= n3 + 165 - 18 && n <= n3 + 165) {
                    s = this.llIllIIIIIllIlIIIIlI(1);
                }
                else {
                    if (n < n3 + 215 - 18 || n > n3 + 215) {
                        return;
                    }
                    s = this.llIllIIIIIllIlIIIIlI(2);
                }
                final String trim = new StringBuilder().append(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s, new Object[0])).toString().trim();
                if (trim.length() > 0) {
                    final int n4 = n + 12;
                    final int n5 = n2 - 12;
                    this.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(n4 - 3, n5 - 3, n4 + this.IlIlIllllllllIIIIlII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(trim) + 3, n5 + 8 + 3, -1073741824, -1073741824);
                    this.IlIlIllllllllIIIIlII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(trim, (float)n4, (float)n5, -1);
                }
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final int n, final int n2) {
        if (lIlIlIIIllIIllIIIllI != null) {
            final String trim = new StringBuilder().append(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(String.valueOf(new net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll()).llIllIlIIIIllIlIIllI()) + ".name", new Object[0])).toString().trim();
            if (trim.length() > 0) {
                final int n3 = n + 12;
                final int n4 = n2 - 12;
                this.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(n3 - 3, n4 - 3, n3 + this.IlIlIllllllllIIIIlII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(trim) + 3, n4 + 8 + 3, -1073741824, -1073741824);
                this.IlIlIllllllllIIIIlII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(trim, (float)n3, (float)n4, -1);
            }
        }
    }
    
    protected void IlIIIlIlIIIllIlIlIIl(final int iIlIIIIlllIlllllIlII) {
        if (iIlIIIIlllIlllllIlII != this.IIlIIIIlllIlllllIlII) {
            this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
            this.IIIlIIlIIIIlllIlllII = -1;
        }
        else if (this.IIIlIIlIIIIlllIlllII == -1) {
            this.IIIlIIlIIIIlllIlllII = 1;
        }
        else {
            this.IIlIIIIlllIlllllIlII = -1;
            this.IIIlIIlIIIIlllIlllII = 0;
        }
        Collections.sort((List<Object>)this.IlIlIlIlIlllllllllIl, this.IlllllllIIIlIIIlIlII);
    }
}
