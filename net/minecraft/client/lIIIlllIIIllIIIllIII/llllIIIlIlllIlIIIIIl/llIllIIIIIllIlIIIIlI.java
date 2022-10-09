package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;

import java.util.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;

public class llIllIIIIIllIlIIIIlI
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private List IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private static volatile /* synthetic */ int[] lIIIIlIIIIIlllIllIII;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public llIllIIIIIllIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this();
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII(); ++i) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(i));
        }
        this.IlIIIlIlIIIllIlIlIIl = llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl();
    }
    
    public llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.llllIIIlIlllIlIIIIIl = -1;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl.clear();
        this.llIllIIIIIllIlIIIIlI.clear();
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl.clear();
        this.llllIIIlIlllIlIIIIIl = -1;
        this.IlIIIlIlIIIllIlIlIIl = 0;
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl() && this.llIllIlIIIIllIlIIllI()) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
            return this;
        }
        this.IlIlIlIlIlllllllllIl.add(ilIIIlIlIIIllIlIlIIl);
        this.llIllIIIIIllIlIIIIlI.add(this.IlIIIlIlIIIllIlIlIIl);
        switch (llIIlIIIlIIIllIlIIIl()[ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl().ordinal()]) {
            case 2: {
                this.llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl;
                break;
            }
            case 3: {
                this.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl;
                break;
            }
            case 4: {
                this.IllIIlllIIIIlllIIlIl.add(ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(), this.IlIIIlIlIIIllIlIlIIl);
                break;
            }
        }
        this.IlIIIlIlIIIllIlIlIIl += ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI();
        return this;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl >= 0;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI >= 0;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n) {
        return this.IllIIlllIIIIlllIIlIl.size() - 1 >= n;
    }
    
    public int IlIlIlIlIlllllllllIl(final int n) {
        return this.IllIIlllIIIIlllIIlIl.get(n);
    }
    
    @Override
    public String toString() {
        String s = "format: " + this.IlIlIlIlIlllllllllIl.size() + " elements: ";
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.size(); ++i) {
            s = String.valueOf(s) + ((IlIIIlIlIIIllIlIlIIl)this.IlIlIlIlIlllllllllIl.get(i)).toString();
            if (i != this.IlIlIlIlIlllllllllIl.size() - 1) {
                s = String.valueOf(s) + " ";
            }
        }
        return s;
    }
    
    private boolean llIllIlIIIIllIlIIllI() {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.size(); ++i) {
            if (((IlIIIlIlIIIllIlIlIIl)this.IlIlIlIlIlllllllllIl.get(i)).IllIIlllIIIIlllIIlIl()) {
                return true;
            }
        }
        return false;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIlIlllIlIIIIIl() / 4;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public List lIIIIlIIIIIlllIllIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIlIlIlIlllllllllIl.size();
    }
    
    public IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl.get(n);
    }
    
    public int IlIIIlIlIIIllIlIlIIl(final int n) {
        return this.llIllIIIIIllIlIIIIlI.get(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = (llIllIIIIIllIlIIIIlI)o;
            return this.IlIIIlIlIIIllIlIlIIl == llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl && this.IlIlIlIlIlllllllllIl.equals(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) && this.llIllIIIIIllIlIIIIlI.equals(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * this.IlIlIlIlIlllllllllIl.hashCode() + this.llIllIIIIIllIlIIIIlI.hashCode()) + this.IlIIIlIlIIIllIlIlIIl;
    }
    
    static /* synthetic */ int[] llIIlIIIlIIIllIlIIIl() {
        final int[] liiiIlIIIIIlllIllIII = llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII != null) {
            return liiiIlIIIIIlllIllIII;
        }
        final int[] liiiIlIIIIIlllIllIII2 = new int[IllIIlllIIIIlllIIlIl.values().length];
        try {
            liiiIlIIIIIlllIllIII2[IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            liiiIlIIIIIlllIllIII2[IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            liiiIlIIIIIlllIllIII2[IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            liiiIlIIIIIlllIllIII2[IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            liiiIlIIIIIlllIllIII2[IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            liiiIlIIIIIlllIllIII2[IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            liiiIlIIIIIlllIllIII2[IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        return llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII2;
    }
}
