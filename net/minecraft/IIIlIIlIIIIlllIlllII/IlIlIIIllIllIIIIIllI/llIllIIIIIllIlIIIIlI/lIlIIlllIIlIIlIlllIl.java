package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class lIlIIlllIIlIIlIlllIl extends IlIIlllllIIllIIlllll
{
    private lllllIIlIlIIIlIlIIIl llllIIllllIlIlIIIIll;
    private lllllIIlIlIIIlIlIIIl IlIllIlIlIIIlIlIlIII;
    private List IIlllIIlIllIllIlIIll;
    private static volatile /* synthetic */ int[] lllIIIIlllllIlIIllIl;
    
    public lIlIIlllIIlIIlIlllIl() {
        this.IIlllIIlIllIllIlIIll = Lists.newArrayList();
    }
    
    public lIlIIlllIIlIIlIlllIl(final Random random, final int n, final int n2, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(0);
        this.IIlllIIlIllIllIlIIll = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        switch (llllIIIIlIIIlIlllIll()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
            case 3:
            case 4: {
                this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(n, 39, n2, n + 58 - 1, 61, n2 + 58 - 1);
                break;
            }
            default: {
                this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(n, 39, n2, n + 58 - 1, 61, n2 + 58 - 1);
                break;
            }
        }
        final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(random);
        this.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl = true;
        this.IIlllIIlIllIllIlIIll.add(new lllllIIIIIlIlIIIIIIl(this.IllIIlllIIIIlllIIlIl, this.llllIIllllIlIlIIIIll));
        this.IIlllIIlIllIllIlIIll.add(new llIIIllIlIllIllIIIIl(this.IllIIlllIIIIlllIIlIl, this.IlIllIlIlIIIlIlIlIII, random));
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new IllIlIllIllIlllIIlll(null));
        arrayList.add(new llIllIIlllllllllllll(null));
        arrayList.add(new lllllIIllIlIllIllllI(null));
        arrayList.add(new lIIllIIIllllIlllIllI(null));
        arrayList.add(new IIllIIIlIIlIlIlIIIII(null));
        arrayList.add(new lIllIIIIIlllIIlIIllI(null));
        arrayList.add(new IllIIlllllIIllIIllIl(null));
        for (final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl : llllIIIIlIIIlIlllIll) {
            if (!lllllIIlIlIIIlIlIIIl.IlIIIlIlIIIllIlIlIIl && !lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl()) {
                for (final IIIllIIIlIlIIllIIIlI iiIllIIIlIlIIllIIIlI : arrayList) {
                    if (iiIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll(lllllIIlIlIIIlIlIIIl)) {
                        this.IIlllIIlIllIllIlIIll.add(iiIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, lllllIIlIlIIIlIlIIIl, random));
                        break;
                    }
                }
            }
        }
        final int ilIlIlIlIlllllllllIl = this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(9, 22);
        final int ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(9, 22);
        final Iterator<IlIIlllllIIllIIlllll> iterator3 = (Iterator<IlIIlllllIIllIIlllll>)this.IIlllIIlIllIllIlIIll.iterator();
        while (iterator3.hasNext()) {
            iterator3.next().llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
        }
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll3 = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(1, 1), this.llllIIIIlIIIlIlllIll(1), this.IlIlIlIlIlllllllllIl(1, 1), this.llllIIIIlIIIlIlllIll(23, 21), this.llllIIIIlIIIlIlllIll(8), this.IlIlIlIlIlllllllllIl(23, 21));
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll4 = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(34, 1), this.llllIIIIlIIIlIlllIll(1), this.IlIlIlIlIlllllllllIl(34, 1), this.llllIIIIlIIIlIlllIll(56, 21), this.llllIIIIlIIIlIlllIll(8), this.IlIlIlIlIlllllllllIl(56, 21));
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll5 = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(22, 22), this.llllIIIIlIIIlIlllIll(13), this.IlIlIlIlIlllllllllIl(22, 22), this.llllIIIIlIIIlIlllIll(35, 35), this.llllIIIIlIIIlIlllIll(17), this.IlIlIlIlIlllllllllIl(35, 35));
        int nextInt = random.nextInt();
        this.IIlllIIlIllIllIlIIll.add(new IIlIlIllllIlllIIIIll(this.IllIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll3, nextInt++));
        this.IIlllIIlIllIllIlIIll.add(new IIlIlIllllIlllIIIIll(this.IllIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll4, nextInt++));
        this.IIlllIIlIllIllIlIIll.add(new IIlllIIlllIIIlIlllII(this.IllIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll5));
    }
    
    private List llllIIIIlIIIlIlllIll(final Random random) {
        final lllllIIlIlIIIlIlIIIl[] array = new lllllIIlIlIIIlIlIIIl[75];
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4; ++j) {
                final int ilIlIlIlIlllllllllIl = IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl(i, 0, j);
                array[ilIlIlIlIlllllllllIl] = new lllllIIlIlIIIlIlIIIl(ilIlIlIlIlllllllllIl);
            }
        }
        for (int k = 0; k < 5; ++k) {
            for (int l = 0; l < 4; ++l) {
                final int ilIlIlIlIlllllllllIl2 = IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl(k, 1, l);
                array[ilIlIlIlIlllllllllIl2] = new lllllIIlIlIIIlIlIIIl(ilIlIlIlIlllllllllIl2);
            }
        }
        for (int n = 1; n < 4; ++n) {
            for (int n2 = 0; n2 < 2; ++n2) {
                final int ilIlIlIlIlllllllllIl3 = IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl(n, 2, n2);
                array[ilIlIlIlIlllllllllIl3] = new lllllIIlIlIIIlIlIIIl(ilIlIlIlIlllllllllIl3);
            }
        }
        this.llllIIllllIlIlIIIIll = array[lIlIIlllIIlIIlIlllIl.llIIlIIIlIIIllIlIIIl];
        for (int n3 = 0; n3 < 5; ++n3) {
            for (int n4 = 0; n4 < 5; ++n4) {
                for (int n5 = 0; n5 < 3; ++n5) {
                    final int ilIlIlIlIlllllllllIl4 = IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl(n3, n5, n4);
                    if (array[ilIlIlIlIlllllllllIl4] != null) {
                        lllIllIIIllllllIllll[] values;
                        for (int length = (values = lllIllIIIllllllIllll.values()).length, n6 = 0; n6 < length; ++n6) {
                            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[n6];
                            final int n7 = n3 + lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII();
                            final int n8 = n5 + lllIllIIIllllllIllll.lIIIlllIIIllIIIllIII();
                            final int n9 = n4 + lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl();
                            if (n7 >= 0 && n7 < 5 && n9 >= 0 && n9 < 5 && n8 >= 0 && n8 < 3) {
                                final int ilIlIlIlIlllllllllIl5 = IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl(n7, n8, n9);
                                if (array[ilIlIlIlIlllllllllIl5] != null) {
                                    if (n9 != n4) {
                                        array[ilIlIlIlIlllllllllIl4].llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI(), array[ilIlIlIlIlllllllllIl5]);
                                    }
                                    else {
                                        array[ilIlIlIlIlllllllllIl4].llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, array[ilIlIlIlIlllllllllIl5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl;
        array[lIlIIlllIIlIIlIlllIl.llIllIlIIIIllIlIIllI].llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lllllIIlIlIIIlIlIIIl = new lllllIIlIlIIIlIlIIIl(1003));
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl2;
        array[lIlIIlllIIlIIlIlllIl.lIlIlIIIllIIllIIIllI].llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, lllllIIlIlIIIlIlIIIl2 = new lllllIIlIlIIIlIlIIIl(1001));
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl3;
        array[lIlIIlllIIlIIlIlllIl.IlIlIIIllIIllIlllllI].llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, lllllIIlIlIIIlIlIIIl3 = new lllllIIlIlIIIlIlIIIl(1002));
        lllllIIlIlIIIlIlIIIl.IlIIIlIlIIIllIlIlIIl = true;
        lllllIIlIlIIIlIlIIIl2.IlIIIlIlIIIllIlIlIIl = true;
        lllllIIlIlIIIlIlIIIl3.IlIIIlIlIIIllIlIlIIl = true;
        this.llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI = true;
        this.IlIllIlIlIIIlIlIlIII = array[IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl(random.nextInt(4), 0, 2)];
        this.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl = true;
        this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()].IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()].IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()].IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()].IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()].IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        final ArrayList arrayList = Lists.newArrayList();
        lllllIIlIlIIIlIlIIIl[] array2;
        for (int length2 = (array2 = array).length, n10 = 0; n10 < length2; ++n10) {
            final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl4 = array2[n10];
            if (lllllIIlIlIIIlIlIIIl4 != null) {
                lllllIIlIlIIIlIlIIIl4.llllIIIIlIIIlIlllIll();
                arrayList.add(lllllIIlIlIIIlIlIIIl4);
            }
        }
        lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll();
        Collections.shuffle(arrayList, random);
        int n11 = 1;
        for (final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl5 : arrayList) {
            int n12 = 0;
            int n13 = 0;
            while (n12 < 2 && n13 < 5) {
                ++n13;
                final int nextInt = random.nextInt(6);
                if (lllllIIlIlIIIlIlIIIl5.llIllIIIIIllIlIIIIlI[nextInt]) {
                    final int ilIlIlIlIlllllllllIl6 = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(nextInt).IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl();
                    lllllIIlIlIIIlIlIIIl5.llIllIIIIIllIlIIIIlI[nextInt] = false;
                    lllllIIlIlIIIlIlIIIl5.IlIlIlIlIlllllllllIl[nextInt].llIllIIIIIllIlIIIIlI[ilIlIlIlIlllllllllIl6] = false;
                    if (lllllIIlIlIIIlIlIIIl5.llllIIIIlIIIlIlllIll(n11++) && lllllIIlIlIIIlIlIIIl5.IlIlIlIlIlllllllllIl[nextInt].llllIIIIlIIIlIlllIll(n11++)) {
                        ++n12;
                    }
                    else {
                        lllllIIlIlIIIlIlIIIl5.llIllIIIIIllIlIIIIlI[nextInt] = true;
                        lllllIIlIlIIIlIlIIIl5.IlIlIlIlIlllllllllIl[nextInt].llIllIIIIIllIlIIIIlI[ilIlIlIlIlllllllllIl6] = true;
                    }
                }
            }
        }
        arrayList.add(lllllIIlIlIIIlIlIIIl);
        arrayList.add(lllllIIlIlIIIlIlIIIl2);
        arrayList.add(lllllIIlIlIIIlIlIIIl3);
        return arrayList;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 58, Math.max(illlllllIIIlIIIlIlII.IlIlIIIlIIlIlIIlllIl(), 64) - this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, 58, false);
        this.llllIIIIlIIIlIlllIll(false, 0, illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(true, 33, illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
        this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
        this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
        this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
        this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
        for (int i = 0; i < 7; ++i) {
            int j = 0;
            while (j < 7) {
                if (j == 0 && i == 3) {
                    j = 6;
                }
                final int n = i * 9;
                final int n2 = j * 9;
                for (int k = 0; k < 4; ++k) {
                    for (int l = 0; l < 4; ++l) {
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, n + k, 0, n2 + l, ilIlIIIlIIlIlIIlllIl);
                        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, n + k, -1, n2 + l, ilIlIIIlIIlIlIIlllIl);
                    }
                }
                if (i != 0 && i != 6) {
                    j += 6;
                }
                else {
                    ++j;
                }
            }
        }
        for (int n3 = 0; n3 < 5; ++n3) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, -1 - n3, 0 + n3 * 2, -1 - n3, -1 - n3, 23, 58 + n3, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 58 + n3, 0 + n3 * 2, -1 - n3, 58 + n3, 23, 58 + n3, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0 - n3, 0 + n3 * 2, -1 - n3, 57 + n3, 23, -1 - n3, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0 - n3, 0 + n3 * 2, 58 + n3, 57 + n3, 23, 58 + n3, false);
        }
        for (final IlIIlllllIIllIIlllll ilIIlllllIIllIIlllll : this.IIlllIIlIllIllIlIIll) {
            if (ilIIlllllIIllIIlllll.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl)) {
                ilIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
            }
        }
        return true;
    }
    
    private void llllIIIIlIIIlIlllIll(final boolean b, final int n, final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, n, 0, n + 23, 20)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 0, 0, 0, n + 24, 0, 20, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 0, 1, 0, n + 24, 10, 20, false);
            for (int i = 0; i < 4; ++i) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + i, i + 1, i, n + i, i + 1, 20, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + i + 7, i + 5, i + 7, n + i + 7, i + 5, 20, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 17 - i, i + 5, i + 7, n + 17 - i, i + 5, 20, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 24 - i, i + 1, i, n + 24 - i, i + 1, 20, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + i + 1, i + 1, i, n + 23 - i, i + 1, i, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + i + 8, i + 5, i + 7, n + 16 - i, i + 5, i + 7, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 4, 4, 4, n + 6, 4, 20, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 7, 4, 4, n + 17, 4, 6, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 18, 4, 4, n + 20, 4, 20, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 11, 8, 11, n + 13, 8, 20, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n + 12, 9, 12, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n + 12, 9, 15, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n + 12, 9, 18, ilIlIIIlIIlIlIIlllIl);
            final int n2 = b ? (n + 19) : (n + 5);
            final int n3 = b ? (n + 5) : (n + 19);
            for (int j = 20; j >= 5; j -= 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n2, 5, j, ilIlIIIlIIlIlIIlllIl);
            }
            for (int k = 19; k >= 7; k -= 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n3, 5, k, ilIlIIIlIIlIlIIlllIl);
            }
            for (int l = 0; l < 4; ++l) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, b ? (n + (24 - (17 - l * 3))) : (n + 17 - l * 3), 5, 5, ilIlIIIlIIlIlIIlllIl);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n3, 5, 5, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 11, 1, 12, n + 13, 7, 12, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 12, 1, 11, n + 12, 7, 13, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 22, 5, 35, 17)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 25, 0, 0, 32, 8, 20, false);
            for (int i = 0; i < 4; ++i) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 25, 5, 5 + i * 4, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 26, 6, 5 + i * 4, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.lIIIIlIIIIIlllIllIII, 26, 5, 5 + i * 4, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 32, 5, 5 + i * 4, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 31, 6, 5 + i * 4, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.lIIIIlIIIIIlllIllIII, 31, 5, 5 + i * 4, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            }
        }
    }
    
    private void llIllIIIIIllIlIIIIlI(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 15, 20, 42, 21)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 0, 21, 42, 0, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 26, 1, 21, 31, 3, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21, 12, 21, 36, 12, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 17, 11, 21, 40, 11, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 16, 10, 21, 41, 10, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 7, 21, 42, 9, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 16, 6, 21, 41, 6, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 17, 5, 21, 40, 5, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21, 4, 21, 36, 4, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 22, 3, 21, 26, 3, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 31, 3, 21, 35, 3, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 23, 2, 21, 25, 2, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 32, 2, 21, 34, 2, 21, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 28, 4, 20, 29, 4, 21, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 27, 3, 21, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 30, 3, 21, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 26, 2, 21, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 31, 2, 21, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 25, 1, 21, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 32, 1, 21, ilIlIIIlIIlIlIIlllIl);
            for (int i = 0; i < 7; ++i) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 28 - i, 6 + i, 21, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 29 + i, 6 + i, 21, ilIlIIIlIIlIlIIlllIl);
            }
            for (int j = 0; j < 4; ++j) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 28 - j, 9 + j, 21, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 29 + j, 9 + j, 21, ilIlIIIlIIlIlIIlllIl);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 28, 12, 21, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 29, 12, 21, ilIlIIIlIIlIlIIlllIl);
            for (int k = 0; k < 3; ++k) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 22 - k * 2, 8, 21, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 22 - k * 2, 9, 21, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 35 + k * 2, 8, 21, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI, 35 + k * 2, 9, 21, ilIlIIIlIIlIlIIlllIl);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 13, 21, 42, 15, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 1, 21, 15, 6, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 16, 1, 21, 16, 5, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 17, 1, 21, 20, 4, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21, 1, 21, 21, 3, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 22, 1, 21, 22, 2, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 23, 1, 21, 24, 1, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 42, 1, 21, 42, 6, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 41, 1, 21, 41, 5, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 37, 1, 21, 40, 4, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 36, 1, 21, 36, 3, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 33, 1, 21, 34, 1, 21, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 35, 1, 21, 35, 2, 21, false);
        }
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 21, 21, 36, 36)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21, 0, 22, 36, 0, 36, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21, 1, 22, 36, 23, 36, false);
            for (int i = 0; i < 4; ++i) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 25, 16, 25, 32, 16, 32, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 25, 17, 25, 25, 19, 25, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 32, 17, 25, 32, 19, 25, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 25, 17, 32, 25, 19, 32, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 32, 17, 32, 32, 19, 32, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 26, 20, 26, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 27, 21, 27, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.lIIIIlIIIIIlllIllIII, 27, 20, 27, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 26, 20, 31, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 27, 21, 30, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.lIIIIlIIIIIlllIllIII, 27, 20, 30, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 31, 20, 31, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 30, 21, 30, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.lIIIIlIIIIIlllIllIII, 30, 20, 30, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 31, 20, 26, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, 30, 21, 27, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.lIIIIlIIIIIlllIllIII, 30, 20, 27, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 28, 21, 27, 29, 21, 27, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 27, 21, 28, 27, 21, 29, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 28, 21, 30, 29, 21, 30, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 30, 21, 28, 30, 21, 29, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
        }
    }
    
    private void IlIlIIIllIllIIIIIllI(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 0, 21, 6, 58)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 21, 6, 0, 57, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 21, 6, 7, 57, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 4, 21, 6, 4, 53, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            for (int i = 0; i < 4; ++i) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, i, i + 1, 21, i, i + 1, 57 - i, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            for (int j = 23; j < 53; j += 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, 5, 5, j, ilIlIIIlIIlIlIIlllIl);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, 5, 5, 52, ilIlIIIlIIlIlIIlllIl);
            for (int k = 0; k < 4; ++k) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, k, k + 1, 21, k, k + 1, 57 - k, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 1, 52, 6, 3, 52, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 51, 5, 3, 53, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
        }
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 51, 21, 58, 58)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 51, 0, 21, 57, 0, 57, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 51, 1, 21, 57, 7, 57, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 51, 4, 21, 53, 4, 53, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            for (int l = 0; l < 4; ++l) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 57 - l, l + 1, 21, 57 - l, l + 1, 57 - l, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            for (int n = 23; n < 53; n += 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, 52, 5, n, ilIlIIIlIIlIlIIlllIl);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, 52, 5, 52, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 51, 1, 52, 53, 3, 52, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 52, 1, 51, 52, 3, 53, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
        }
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 0, 51, 57, 57)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 0, 51, 50, 0, 57, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 51, 50, 10, 57, false);
            for (int n2 = 0; n2 < 4; ++n2) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n2 + 1, n2 + 1, 57 - n2, 56 - n2, n2 + 1, 57 - n2, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
        }
    }
    
    private void IllIIlllIIIIlllIIlIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 7, 21, 13, 50)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 0, 21, 13, 0, 50, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 21, 13, 10, 50, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 8, 21, 13, 8, 53, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            for (int i = 0; i < 4; ++i) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, i + 7, i + 5, 21, i + 7, i + 5, 54, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            for (int j = 21; j <= 45; j += 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, 12, 9, j, ilIlIIIlIIlIlIIlllIl);
            }
        }
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 44, 21, 50, 54)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 44, 0, 21, 50, 0, 50, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 44, 1, 21, 50, 10, 50, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 44, 8, 21, 46, 8, 53, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            for (int k = 0; k < 4; ++k) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 50 - k, k + 5, 21, 50 - k, k + 5, 54, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            for (int l = 21; l <= 45; l += 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, 45, 9, l, ilIlIIIlIIlIlIIlllIl);
            }
        }
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 8, 44, 49, 54)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 14, 0, 44, 43, 0, 50, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 14, 1, 44, 43, 10, 50, false);
            for (int n = 12; n <= 45; n += 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 9, 45, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 9, 52, ilIlIIIlIIlIlIIlllIl);
                if (n == 12 || n == 18 || n == 24 || n == 33 || n == 39 || n == 45) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 9, 47, ilIlIIIlIIlIlIIlllIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 9, 50, ilIlIIIlIIlIlIIlllIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 10, 45, ilIlIIIlIIlIlIIlllIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 10, 46, ilIlIIIlIIlIlIIlllIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 10, 51, ilIlIIIlIIlIlIIlllIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 10, 52, ilIlIIIlIIlIlIIlllIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 11, 47, ilIlIIIlIIlIlIIlllIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 11, 50, ilIlIIIlIIlIlIIlllIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 12, 48, ilIlIIIlIIlIlIIlllIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n, 12, 49, ilIlIIIlIIlIlIIlllIl);
                }
            }
            for (int n2 = 0; n2 < 3; ++n2) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8 + n2, 5 + n2, 54, 49 - n2, 5 + n2, 54, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 8, 54, 46, 8, 54, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 14, 8, 44, 43, 8, 53, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
        }
    }
    
    private void llllIIIlIlllIlIIIIIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 14, 21, 20, 43)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 14, 0, 21, 20, 0, 43, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 14, 1, 22, 20, 14, 43, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 18, 12, 22, 20, 12, 39, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 18, 12, 21, 20, 12, 21, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            for (int i = 0; i < 4; ++i) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, i + 14, i + 9, 21, i + 14, i + 9, 43 - i, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            for (int j = 23; j <= 39; j += 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, 19, 13, j, ilIlIIIlIIlIlIIlllIl);
            }
        }
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 37, 21, 43, 43)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 37, 0, 21, 43, 0, 43, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 37, 1, 22, 43, 14, 43, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 37, 12, 22, 39, 12, 39, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 37, 12, 21, 39, 12, 21, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            for (int k = 0; k < 4; ++k) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 43 - k, k + 9, 21, 43 - k, k + 9, 43 - k, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            for (int l = 23; l <= 39; l += 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, 38, 13, l, ilIlIIIlIIlIlIIlllIl);
            }
        }
        if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, 15, 37, 42, 43)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21, 0, 37, 36, 0, 43, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21, 1, 37, 36, 14, 43, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 21, 12, 37, 36, 12, 39, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll, false);
            for (int n = 0; n < 4; ++n) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15 + n, n + 9, 43 - n, 42 - n, n + 9, 43 - n, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl, false);
            }
            for (int n2 = 21; n2 <= 36; n2 += 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl, n2, 13, 38, ilIlIIIlIIlIlIIlllIl);
            }
        }
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] lllIIIIlllllIlIIllIl = lIlIIlllIIlIIlIlllIl.lllIIIIlllllIlIIllIl;
        if (lllIIIIlllllIlIIllIl != null) {
            return lllIIIIlllllIlIIllIl;
        }
        final int[] lllIIIIlllllIlIIllIl2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lIlIIlllIIlIIlIlllIl.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl2;
    }
}
