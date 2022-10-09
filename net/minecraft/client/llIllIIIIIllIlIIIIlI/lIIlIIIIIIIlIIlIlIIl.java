package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;

public class lIIlIIIIIIIlIIlIlIIl extends llIllIIIIIllIlIIIIlI
{
    private final int llllIIIlIlllIlIIIIIl;
    private final FontRenderer lIIIIlIIIIIlllIllIII;
    public int IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    private final int lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    private String llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    private boolean IIIIlllIIIIIIlIIIlll;
    private boolean llllIIllllIlIlIIIIll;
    private boolean IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    private int lllIIIIlllllIlIIllIl;
    private int IlIlIIIIIIlllIlIllIl;
    private int IIllIIllIIIlIlIIIIlI;
    private int IIIlIIIlIlIIlllIIlll;
    private int IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    private lIlIIlllIIlIIlIlllIl IIlIIIIlllIlllllIlII;
    private Predicate IIIlIIlIIIIlllIlllII;
    
    public lIIlIIIIIIIlIIlIlIIl(final int llllIIIlIlllIlIIIIIl, final FontRenderer liiiIlIIIIIlllIllIII, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl, final int liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl) {
        this.llIllIlIIIIllIlIIllI = "";
        this.lIlIlIIIllIIllIIIllI = 32;
        this.IIIIlllIIIIIIlIIIlll = true;
        this.llllIIllllIlIlIIIIll = true;
        this.IIlllIIlIllIllIlIIll = true;
        this.IIIlIIIlIlIIlllIIlll = 14737632;
        this.IlIlIIIlIIlIlIIlllIl = 7368816;
        this.IlllllllIIIlIIIlIlII = true;
        this.IIIlIIlIIIIlllIlllII = Predicates.alwaysTrue();
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIlIIlllIIlIIlIlllIl iIlIIIIlllIlllllIlII) {
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        ++this.IlIlIIIllIIllIlllllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final String llIllIlIIIIllIlIIllI) {
        if (this.IIIlIIlIIIIlllIlllII.apply((Object)llIllIlIIIIllIlIIllI)) {
            if (llIllIlIIIIllIlIIllI.length() > this.lIlIlIIIllIIllIIIllI) {
                this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.substring(0, this.lIlIlIIIllIIllIIIllI);
            }
            else {
                this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
            }
            this.IllIIlllIIIIlllIIlIl();
        }
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llIllIlIIIIllIlIIllI.substring((this.IlIlIIIIIIlllIlIllIl < this.IIllIIllIIIlIlIIIIlI) ? this.IlIlIIIIIIlllIlIllIl : this.IIllIIllIIIlIlIIIIlI, (this.IlIlIIIIIIlllIlIllIl < this.IIllIIllIIIlIlIIIIlI) ? this.IIllIIllIIIlIlIIIIlI : this.IlIlIIIIIIlllIlIllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final Predicate iiIlIIlIIIIlllIlllII) {
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
    }
    
    public void IlIlIlIlIlllllllllIl(final String s) {
        String string = "";
        final String llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s);
        final int n = (this.IlIlIIIIIIlllIlIllIl < this.IIllIIllIIIlIlIIIIlI) ? this.IlIlIIIIIIlllIlIllIl : this.IIllIIllIIIlIlIIIIlI;
        final int n2 = (this.IlIlIIIIIIlllIlIllIl < this.IIllIIllIIIlIlIIIIlI) ? this.IIllIIllIIIlIlIIIIlI : this.IlIlIIIIIIlllIlIllIl;
        final int n3 = this.lIlIlIIIllIIllIIIllI - this.llIllIlIIIIllIlIIllI.length() - (n - n2);
        if (this.llIllIlIIIIllIlIIllI.length() > 0) {
            string = String.valueOf(string) + this.llIllIlIIIIllIlIIllI.substring(0, n);
        }
        String llIllIlIIIIllIlIIllI;
        int length;
        if (n3 < llllIIIIlIIIlIlllIll.length()) {
            llIllIlIIIIllIlIIllI = String.valueOf(string) + llllIIIIlIIIlIlllIll.substring(0, n3);
            length = n3;
        }
        else {
            llIllIlIIIIllIlIIllI = String.valueOf(string) + llllIIIIlIIIlIlllIll;
            length = llllIIIIlIIIlIlllIll.length();
        }
        if (this.llIllIlIIIIllIlIIllI.length() > 0 && n2 < this.llIllIlIIIIllIlIIllI.length()) {
            llIllIlIIIIllIlIIllI = String.valueOf(llIllIlIIIIllIlIIllI) + this.llIllIlIIIIllIlIIllI.substring(n2);
        }
        if (this.IIIlIIlIIIIlllIlllII.apply((Object)llIllIlIIIIllIlIIllI)) {
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
            this.IlIIIlIlIIIllIlIlIIl(n - this.IIllIIllIIIlIlIIIIlI + length);
            if (this.IIlIIIIlllIlllllIlII != null) {
                this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, this.llIllIlIIIIllIlIIllI);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (this.llIllIlIIIIllIlIIllI.length() != 0) {
            if (this.IIllIIllIIIlIlIIIIlI != this.IlIlIIIIIIlllIlIllIl) {
                this.IlIlIlIlIlllllllllIl("");
            }
            else {
                this.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI(n) - this.IlIlIIIIIIlllIlIllIl);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        if (this.llIllIlIIIIllIlIIllI.length() != 0) {
            if (this.IIllIIllIIIlIlIIIIlI != this.IlIlIIIIIIlllIlIllIl) {
                this.IlIlIlIlIlllllllllIl("");
            }
            else {
                final boolean b = n < 0;
                final int n2 = b ? (this.IlIlIIIIIIlllIlIllIl + n) : this.IlIlIIIIIIlllIlIllIl;
                final int n3 = b ? this.IlIlIIIIIIlllIlIllIl : (this.IlIlIIIIIIlllIlIllIl + n);
                String llIllIlIIIIllIlIIllI = "";
                if (n2 >= 0) {
                    llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI.substring(0, n2);
                }
                if (n3 < this.llIllIlIIIIllIlIIllI.length()) {
                    llIllIlIIIIllIlIIllI = String.valueOf(llIllIlIIIIllIlIIllI) + this.llIllIlIIIIllIlIIllI.substring(n3);
                }
                if (this.IIIlIIlIIIIlllIlllII.apply((Object)llIllIlIIIIllIlIIllI)) {
                    this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
                    if (b) {
                        this.IlIIIlIlIIIllIlIlIIl(n);
                    }
                    if (this.IIlIIIIlllIlllllIlII != null) {
                        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, this.llIllIlIIIIllIlIIllI);
                    }
                }
            }
        }
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.llllIIIIlIIIlIlllIll(n, this.lIIIlllIIIllIIIllIII());
    }
    
    public int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll(n, n2, true);
    }
    
    public int llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean b) {
        int index = n2;
        final boolean b2 = n < 0;
        for (int abs = Math.abs(n), i = 0; i < abs; ++i) {
            if (!b2) {
                final int length = this.llIllIlIIIIllIlIIllI.length();
                index = this.llIllIlIIIIllIlIIllI.indexOf(32, index);
                if (index == -1) {
                    index = length;
                }
                else {
                    while (b && index < length) {
                        if (this.llIllIlIIIIllIlIIllI.charAt(index) != ' ') {
                            break;
                        }
                        ++index;
                    }
                }
            }
            else {
                while (b && index > 0) {
                    if (this.llIllIlIIIIllIlIIllI.charAt(index - 1) != ' ') {
                        break;
                    }
                    --index;
                }
                while (index > 0 && this.llIllIlIIIIllIlIIllI.charAt(index - 1) != ' ') {
                    --index;
                }
            }
        }
        return index;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final int n) {
        this.IlIlIIIllIllIIIIIllI(this.IIllIIllIIIlIlIIIIlI + n);
    }
    
    public void IlIlIIIllIllIIIIIllI(final int ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        this.lIIIlllIIIllIIIllIII(this.IlIlIIIIIIlllIlIllIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIIIIlllIlIllIl, 0, this.llIllIlIIIIllIlIIllI.length()));
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIIIllIllIIIIIllI(0);
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        this.IlIlIIIllIllIIIIIllI(this.llIllIlIIIIllIlIIllI.length());
    }
    
    public boolean llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (!this.IlIllIlIlIIIlIlIlIII) {
            return false;
        }
        if (lIIllIIIllllIlllIllI.llllIIIlIlllIlIIIIIl(n)) {
            this.IllIIlllIIIIlllIIlIl();
            this.lIIIlllIIIllIIIllIII(0);
            return true;
        }
        if (lIIllIIIllllIlllIllI.IllIIlllIIIIlllIIlIl(n)) {
            lIIllIIIllllIlllIllI.IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI());
            return true;
        }
        if (lIIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI(n)) {
            if (this.IIlllIIlIllIllIlIIll) {
                this.IlIlIlIlIlllllllllIl(lIIllIIIllllIlllIllI.llIIlIIIlIIIllIlIIIl());
            }
            return true;
        }
        if (lIIllIIIllllIlllIllI.IlIIIlIlIIIllIlIlIIl(n)) {
            lIIllIIIllllIlllIllI.IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI());
            if (this.IIlllIIlIllIllIlIIll) {
                this.IlIlIlIlIlllllllllIl("");
            }
            return true;
        }
        switch (n) {
            case 14: {
                if (lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll()) {
                    if (this.IIlllIIlIllIllIlIIll) {
                        this.llllIIIIlIIIlIlllIll(-1);
                    }
                }
                else if (this.IIlllIIlIllIllIlIIll) {
                    this.IlIlIlIlIlllllllllIl(-1);
                }
                return true;
            }
            case 199: {
                if (lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll()) {
                    this.lIIIlllIIIllIIIllIII(0);
                }
                else {
                    this.IlIlIIIllIllIIIIIllI();
                }
                return true;
            }
            case 203: {
                if (lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll()) {
                    if (lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll()) {
                        this.lIIIlllIIIllIIIllIII(this.llllIIIIlIIIlIlllIll(-1, this.lIlIlIIIllIIllIIIllI()));
                    }
                    else {
                        this.lIIIlllIIIllIIIllIII(this.lIlIlIIIllIIllIIIllI() - 1);
                    }
                }
                else if (lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll()) {
                    this.IlIlIIIllIllIIIIIllI(this.llIllIIIIIllIlIIIIlI(-1));
                }
                else {
                    this.IlIIIlIlIIIllIlIlIIl(-1);
                }
                return true;
            }
            case 205: {
                if (lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll()) {
                    if (lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll()) {
                        this.lIIIlllIIIllIIIllIII(this.llllIIIIlIIIlIlllIll(1, this.lIlIlIIIllIIllIIIllI()));
                    }
                    else {
                        this.lIIIlllIIIllIIIllIII(this.lIlIlIIIllIIllIIIllI() + 1);
                    }
                }
                else if (lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll()) {
                    this.IlIlIIIllIllIIIIIllI(this.llIllIIIIIllIlIIIIlI(1));
                }
                else {
                    this.IlIIIlIlIIIllIlIlIIl(1);
                }
                return true;
            }
            case 207: {
                if (lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll()) {
                    this.lIIIlllIIIllIIIllIII(this.llIllIlIIIIllIlIIllI.length());
                }
                else {
                    this.IllIIlllIIIIlllIIlIl();
                }
                return true;
            }
            case 211: {
                if (lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll()) {
                    if (this.IIlllIIlIllIllIlIIll) {
                        this.llllIIIIlIIIlIlllIll(1);
                    }
                }
                else if (this.IIlllIIlIllIllIlIIll) {
                    this.IlIlIlIlIlllllllllIl(1);
                }
                return true;
            }
            default: {
                if (net.minecraft.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(c)) {
                    if (this.IIlllIIlIllIllIlIIll) {
                        this.IlIlIlIlIlllllllllIl(Character.toString(c));
                    }
                    return true;
                }
                return false;
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final boolean b = n >= this.IlIlIIIllIllIIIIIllI && n < this.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII && n2 >= this.IllIIlllIIIIlllIIlIl && n2 < this.IllIIlllIIIIlllIIlIl + this.llIIlIIIlIIIllIlIIIl;
        if (this.llllIIllllIlIlIIIIll) {
            this.IlIlIlIlIlllllllllIl(b);
        }
        if (this.IlIllIlIlIIIlIlIlIII && b && n3 == 0) {
            int n4 = n - this.IlIlIIIllIllIIIIIllI;
            if (this.IIIIlllIIIIIIlIIIlll) {
                n4 -= 4;
            }
            this.IlIlIIIllIllIIIIIllI(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI.substring(this.lllIIIIlllllIlIIllIl), this.IlIlIIIllIIllIlllllI()), n4).length() + this.lllIIIIlllllIlIIllIl);
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        if (this.IIIIlllIIIIIIlIIIlll()) {
            if (this.llIIlIIIlIIIllIlIIIl()) {
                net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI - 1, this.IllIIlllIIIIlllIIlIl - 1, this.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII + 1, this.IllIIlllIIIIlllIIlIl + this.llIIlIIIlIIIllIlIIIl + 1, -6250336);
                net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII, this.IllIIlllIIIIlllIIlIl + this.llIIlIIIlIIIllIlIIIl, -16777216);
            }
            final int n = this.IIlllIIlIllIllIlIIll ? this.IIIlIIIlIlIIlllIIlll : this.IlIlIIIlIIlIlIIlllIl;
            final int n2 = this.IlIlIIIIIIlllIlIllIl - this.lllIIIIlllllIlIIllIl;
            int length = this.IIllIIllIIIlIlIIIIlI - this.lllIIIIlllllIlIIllIl;
            final String llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI.substring(this.lllIIIIlllllIlIIllIl), this.IlIlIIIllIIllIlllllI());
            final boolean b = n2 >= 0 && n2 <= llllIIIIlIIIlIlllIll.length();
            final boolean b2 = this.IlIllIlIlIIIlIlIlIII && this.IlIlIIIllIIllIlllllI / 6 % 2 == 0 && b;
            final int n3 = this.IIIIlllIIIIIIlIIIlll ? (this.IlIlIIIllIllIIIIIllI + 4) : this.IlIlIIIllIllIIIIIllI;
            final int n4 = this.IIIIlllIIIIIIlIIIlll ? (this.IllIIlllIIIIlllIIlIl + (this.llIIlIIIlIIIllIlIIIl - 8) / 2) : this.IllIIlllIIIIlllIIlIl;
            int llllIIIIlIIIlIlllIll2 = n3;
            if (length > llllIIIIlIIIlIlllIll.length()) {
                length = llllIIIIlIIIlIlllIll.length();
            }
            if (llllIIIIlIIIlIlllIll.length() > 0) {
                llllIIIIlIIIlIlllIll2 = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(b ? llllIIIIlIIIlIlllIll.substring(0, n2) : llllIIIIlIIIlIlllIll, (float)n3, (float)n4, n);
            }
            final boolean b3 = this.IlIlIIIIIIlllIlIllIl < this.llIllIlIIIIllIlIIllI.length() || this.llIllIlIIIIllIlIIllI.length() >= this.lIIIIlIIIIIlllIllIII();
            int n5 = llllIIIIlIIIlIlllIll2;
            if (!b) {
                n5 = ((n2 > 0) ? (n3 + this.lIIIlllIIIllIIIllIII) : n3);
            }
            else if (b3) {
                n5 = llllIIIIlIIIlIlllIll2 - 1;
                --llllIIIIlIIIlIlllIll2;
            }
            if (llllIIIIlIIIlIlllIll.length() > 0 && b && n2 < llllIIIIlIIIlIlllIll.length()) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.substring(n2), (float)llllIIIIlIIIlIlllIll2, (float)n4, n);
            }
            if (b2) {
                if (b3) {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n5, n4 - 1, n5 + 1, n4 + 1 + this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, -3092272);
                }
                else {
                    this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("_", (float)n5, (float)n4, n);
                }
            }
            if (length != n2) {
                this.llIllIIIIIllIlIIIIlI(n5, n4 - 1, n3 + this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.substring(0, length)) - 1, n4 + 1 + this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    private void llIllIIIIIllIlIIIIlI(int n, int n2, int n3, int n4) {
        if (n < n3) {
            final int n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            final int n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        if (n3 > this.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII) {
            n3 = this.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII;
        }
        if (n > this.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII) {
            n = this.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII;
        }
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 255.0f, 255.0f);
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        lllllIlIIIlIlIIlllII.IlIlIIIIIIlllIlIllIl();
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl(5387);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n4, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n4, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n2, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2, 0.0).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI();
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
    }
    
    public void IllIIlllIIIIlllIIlIl(final int lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        if (this.llIllIlIIIIllIlIIllI.length() > lIlIlIIIllIIllIIIllI) {
            this.llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI.substring(0, lIlIlIIIllIIllIIIllI);
        }
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public void llllIIIlIlllIlIIIIIl(final int iiIlIIIlIlIIlllIIlll) {
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
    }
    
    public void lIIIIlIIIIIlllIllIII(final int ilIlIIIlIIlIlIIlllIl) {
        this.IlIlIIIlIIlIlIIlllIl = ilIlIIIlIIlIlIIlllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean ilIllIlIlIIIlIlIlIII) {
        if (ilIllIlIlIIIlIlIlIII && !this.IlIllIlIlIIIlIlIlIII) {
            this.IlIlIIIllIIllIlllllI = 0;
        }
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean iIlllIIlIllIllIlIIll) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public int lIlIlIIIllIIllIIIllI() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public int IlIlIIIllIIllIlllllI() {
        return this.llIIlIIIlIIIllIlIIIl() ? (this.lIIIlllIIIllIIIllIII - 8) : this.lIIIlllIIIllIIIllIII;
    }
    
    public void lIIIlllIIIllIIIllIII(int iIllIIllIIIlIlIIIIlI) {
        final int length = this.llIllIlIIIIllIlIIllI.length();
        if (iIllIIllIIIlIlIIIIlI > length) {
            iIllIIllIIIlIlIIIIlI = length;
        }
        if (iIllIIllIIIlIlIIIIlI < 0) {
            iIllIIllIIIlIlIIIIlI = 0;
        }
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
        if (this.lIIIIlIIIIIlllIllIII != null) {
            if (this.lllIIIIlllllIlIIllIl > length) {
                this.lllIIIIlllllIlIIllIl = length;
            }
            final int ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI();
            final int n = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI.substring(this.lllIIIIlllllIlIIllIl), ilIlIIIllIIllIlllllI).length() + this.lllIIIIlllllIlIIllIl;
            if (iIllIIllIIIlIlIIIIlI == this.lllIIIIlllllIlIIllIl) {
                this.lllIIIIlllllIlIIllIl -= this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, ilIlIIIllIIllIlllllI, true).length();
            }
            if (iIllIIllIIIlIlIIIIlI > n) {
                this.lllIIIIlllllIlIIllIl += iIllIIllIIIlIlIIIIlI - n;
            }
            else if (iIllIIllIIIlIlIIIIlI <= this.lllIIIIlllllIlIIllIl) {
                this.lllIIIIlllllIlIIllIl -= this.lllIIIIlllllIlIIllIl - iIllIIllIIIlIlIIIIlI;
            }
            this.lllIIIIlllllIlIIllIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, 0, length);
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final boolean llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public boolean IIIIlllIIIIIIlIIIlll() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    public void IlIlIIIllIllIIIIIllI(final boolean illlllllIIIlIIIlIlII) {
        this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
    }
}
