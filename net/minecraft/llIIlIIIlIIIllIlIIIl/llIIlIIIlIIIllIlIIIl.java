package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class llIIlIIIlIIIllIlIIIl extends IlIlIlIlIlllllllllIl
{
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll;
    private IlllllllIIIlIIIlIlII lIIIlllIIIllIIIllIII;
    private net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl;
    private Random llIllIlIIIIllIlIIllI;
    public int IllIIlllIIIIlllIIlIl;
    public int[] llllIIIlIlllIlIIIIIl;
    public int[] lIIIIlIIIIIlllIllIII;
    
    public llIIlIIIlIIIllIlIIIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this(illIIlllIIIIlllIIlIl, illlllllIIIlIIIlIlII, net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll);
    }
    
    public llIIlIIIlIIIllIlIIIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlllllllIIIlIIIlIlII liiIlllIIIllIIIllIII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl) {
        this.llllIIIIlIIIlIlllIll = new llIllIlIIIIllIlIIllI(this, "Enchant", true, 2);
        this.llIllIlIIIIllIlIIllI = new Random();
        this.llllIIIlIlllIlIIIIIl = new int[3];
        this.lIIIIlIIIIIlllIllIII = new int[] { -1, -1, -1 };
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.ao();
        this.IlIlIlIlIlllllllllIl(new lIlIlIIIllIIllIIIllI(this, this.llllIIIIlIIIlIlllIll, 0, 15, 47));
        this.IlIlIlIlIlllllllllIl(new IlIlIIIllIIllIlllllI(this, this.llllIIIIlIIIlIlllIll, 1, 35, 47));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, k, 8 + k * 18, 142));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        super.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 0, this.llllIIIlIlllIlIIIIIl[0]);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 1, this.llllIIIlIlllIlIIIIIl[1]);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 2, this.llllIIIlIlllIlIIIIIl[2]);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 3, this.IllIIlllIIIIlllIIlIl & 0xFFFFFFF0);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 4, this.lIIIIlIIIIIlllIllIII[0]);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 5, this.lIIIIlIIIIIlllIllIII[1]);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 6, this.lIIIIlIIIIIlllIllIII[2]);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        super.llIllIIIIIllIlIIIIlI();
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.size(); ++i) {
            final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = this.IlIlIIIllIllIIIIIllI.get(i);
            ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 0, this.llllIIIlIlllIlIIIIIl[0]);
            ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 1, this.llllIIIlIlllIlIIIIIl[1]);
            ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 2, this.llllIIIlIlllIlIIIIIl[2]);
            ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 3, this.IllIIlllIIIIlllIIlIl & 0xFFFFFFF0);
            ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 4, this.lIIIIlIIIIIlllIllIII[0]);
            ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 5, this.lIIIIlIIIIIlllIllIII[1]);
            ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 6, this.lIIIIlIIIIIlllIllIII[2]);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int illIIlllIIIIlllIIlIl) {
        if (n >= 0 && n <= 2) {
            this.llllIIIlIlllIlIIIIIl[n] = illIIlllIIIIlllIIlIl;
        }
        else if (n == 3) {
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        }
        else if (n >= 4 && n <= 6) {
            this.lIIIIlIIIIIlllIllIII[n - 4] = illIIlllIIIIlllIIlIl;
        }
        else {
            super.llllIIIIlIIIlIlllIll(n, illIIlllIIIIlllIIlIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        if (llIIIlIlIllIIlIlIlII == this.llllIIIIlIIIlIlllIll) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = llIIIlIlIllIIlIlIlII.lIlIlIIIllIIllIIIllI(0);
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl()) {
                if (!this.lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII) {
                    int n = 0;
                    for (int i = -1; i <= 1; ++i) {
                        for (int j = -1; j <= 1; ++j) {
                            if ((i != 0 || j != 0) && this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(j, 0, i)) && this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(j, 1, i))) {
                                if (this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(j * 2, 0, i * 2)).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl) {
                                    ++n;
                                }
                                if (this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(j * 2, 1, i * 2)).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl) {
                                    ++n;
                                }
                                if (j != 0 && i != 0) {
                                    if (this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(j * 2, 0, i)).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl) {
                                        ++n;
                                    }
                                    if (this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(j * 2, 1, i)).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl) {
                                        ++n;
                                    }
                                    if (this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(j, 0, i * 2)).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl) {
                                        ++n;
                                    }
                                    if (this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(j, 1, i * 2)).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl) {
                                        ++n;
                                    }
                                }
                            }
                        }
                    }
                    this.llIllIlIIIIllIlIIllI.setSeed(this.IllIIlllIIIIlllIIlIl);
                    for (int k = 0; k < 3; ++k) {
                        this.llllIIIlIlllIlIIIIIl[k] = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, k, n, lIlIlIIIllIIllIIIllI);
                        this.lIIIIlIIIIIlllIllIII[k] = -1;
                        if (this.llllIIIlIlllIlIIIIIl[k] < k + 1) {
                            this.llllIIIlIlllIlIIIIIl[k] = 0;
                        }
                    }
                    for (int l = 0; l < 3; ++l) {
                        if (this.llllIIIlIlllIlIIIIIl[l] > 0) {
                            final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, l, this.llllIIIlIlllIlIIIIIl[l]);
                            if (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.isEmpty()) {
                                final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.get(this.llIllIlIIIIllIlIIllI.nextInt(llllIIIIlIIIlIlllIll.size()));
                                this.lIIIIlIIIIIlllIllIII[l] = (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl | llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl << 8);
                            }
                        }
                    }
                    this.llIllIIIIIllIlIIIIlI();
                }
            }
            else {
                for (int n2 = 0; n2 < 3; ++n2) {
                    this.llllIIIlIlllIlIIIIIl[n2] = 0;
                    this.lIIIIlIIIIIlllIllIII[n2] = -1;
                }
            }
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(0);
        final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI2 = this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(1);
        final int n2 = n + 1;
        if ((lIlIlIIIllIIllIIIllI2 == null || lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl < n2) && !llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            return false;
        }
        if (this.llllIIIlIlllIlIIIIIl[n] > 0 && lIlIlIIIllIIllIIIllI != null && ((llllIIIIlIIIlIlllIll.L >= n2 && llllIIIIlIIIlIlllIll.L >= this.llllIIIlIlllIlIIIIIl[n]) || llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl)) {
            if (!this.lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII) {
                final List llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, n, this.llllIIIlIlllIlIIIIIl[n]);
                final boolean b = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IIlIlllIlIlllIlIllll;
                if (llllIIIIlIIIlIlllIll2 != null) {
                    llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl(n2);
                    if (b) {
                        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.ah);
                    }
                    for (int i = 0; i < llllIIIIlIIIlIlllIll2.size(); ++i) {
                        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll2.get(i);
                        if (b) {
                            IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llllIIIlIlllIlIIIIIl);
                        }
                        else {
                            lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
                        }
                    }
                    if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI2;
                        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl -= n2;
                        if (lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl <= 0) {
                            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(1, null);
                        }
                    }
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IllIlIIllIllIIlIllII);
                    this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII();
                    this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.ao();
                    this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
                }
            }
            return true;
        }
        return false;
    }
    
    private List llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        this.llIllIlIIIIllIlIIllI.setSeed(this.IllIIlllIIIIlllIIlIl + n);
        final List ilIlIlIlIlllllllllIl = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(this.llIllIlIIIIllIlIIllI, lllIIIIlIlIllIIlIIIl, n2);
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IIlIlllIlIlllIlIllll && ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl.size() > 1) {
            ilIlIlIlIlllllllllIl.remove(this.llIllIlIIIIllIlIIllI.nextInt(ilIlIlIlIlllllllllIl.size()));
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(1);
        return (lIlIlIIIllIIllIIIllI == null) ? 0 : lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (!this.lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII) {
            for (int i = 0; i < this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(); ++i) {
                final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(i);
                if (ilIlIIIllIIllIlllllI != null) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, false);
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl).llIllIIIIIllIlIIIIlI() == llllIIIIlIIIlIlllIll.G && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII() + 0.5, this.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII() + 0.5, this.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl() + 0.5) <= 64.0;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = null;
        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(n);
        if (iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl()) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll();
            llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl();
            if (n == 0) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 2, 38, true)) {
                    return null;
                }
            }
            else if (n == 1) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 2, 38, true)) {
                    return null;
                }
            }
            else if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.a && net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII()) == net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 1, 2, true)) {
                    return null;
                }
            }
            else {
                if (this.llIllIIIIIllIlIIIIlI.get(0).IlIlIlIlIlllllllllIl() || !this.llIllIIIIIllIlIIIIlI.get(0).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) {
                    return null;
                }
                if (llllIIIIlIIIlIlllIll2.IIIIlllIIIIIIlIIIlll() && llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == 1) {
                    this.llIllIIIIIllIlIIIIlI.get(0).IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl());
                    llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl = 0;
                }
                else if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl >= 1) {
                    this.llIllIIIIIllIlIIIIlI.get(0).IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), 1, llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII()));
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = llllIIIIlIIIlIlllIll2;
                    --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                }
            }
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == 0) {
                iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl(null);
            }
            else {
                iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI();
            }
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl) {
                return null;
            }
            iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        }
        return llIIlIIIlIIIllIlIIIl;
    }
}
