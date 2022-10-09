package net.minecraft.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.concurrent.*;
import java.util.*;

public class lIIIlllIIIllIIIllIII
{
    private final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    private StackTraceElement[] IlIIIlIlIIIllIlIlIIl;
    
    public lIIIlllIIIllIIIllIII(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = new StackTraceElement[0];
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public static String llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        return String.format("%.2f,%.2f,%.2f - %s", n, n2, n3, llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n, n2, n3)));
    }
    
    public static String llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        final StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format("World: (%d,%d,%d)", liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl));
        }
        catch (Throwable t) {
            sb.append("(Error finding world loc)");
        }
        sb.append(", ");
        try {
            final int n = liiiIlIIIIIlllIllIII >> 4;
            final int n2 = llIIlIIIlIIIllIlIIIl >> 4;
            sb.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", liiiIlIIIIIlllIllIII & 0xF, liiIlllIIIllIIIllIII >> 4, llIIlIIIlIIIllIlIIIl & 0xF, n, n2, n << 4, n2 << 4, (n + 1 << 4) - 1, (n2 + 1 << 4) - 1));
        }
        catch (Throwable t2) {
            sb.append("(Error finding chunk loc)");
        }
        sb.append(", ");
        try {
            final int n3 = liiiIlIIIIIlllIllIII >> 9;
            final int n4 = llIIlIIIlIIIllIlIIIl >> 9;
            sb.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", n3, n4, n3 << 5, n4 << 5, (n3 + 1 << 5) - 1, (n4 + 1 << 5) - 1, n3 << 9, n4 << 9, (n3 + 1 << 9) - 1, (n4 + 1 << 9) - 1));
        }
        catch (Throwable t3) {
            sb.append("(Error finding world loc)");
        }
        return sb.toString();
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final Callable callable) {
        try {
            this.llllIIIIlIIIlIlllIll(s, callable.call());
        }
        catch (Throwable t) {
            this.llllIIIIlIIIlIlllIll(s, t);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final Object o) {
        this.llIllIIIIIllIlIIIIlI.add(new llllIIllllIlIlIIIIll(s, o));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final Throwable t) {
        this.llllIIIIlIIIlIlllIll(s, (Object)t);
    }
    
    public int llllIIIIlIIIlIlllIll(final int n) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= 0) {
            return 0;
        }
        System.arraycopy(stackTrace, 3 + n, this.IlIIIlIlIIIllIlIlIIl = new StackTraceElement[stackTrace.length - 3 - n], 0, this.IlIIIlIlIIIllIlIlIIl.length);
        return this.IlIIIlIlIIIllIlIlIIl.length;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final StackTraceElement stackTraceElement, final StackTraceElement stackTraceElement2) {
        if (this.IlIIIlIlIIIllIlIlIIl.length == 0 || stackTraceElement == null) {
            return false;
        }
        final StackTraceElement stackTraceElement3 = this.IlIIIlIlIIIllIlIlIIl[0];
        if (stackTraceElement3.isNativeMethod() != stackTraceElement.isNativeMethod() || !stackTraceElement3.getClassName().equals(stackTraceElement.getClassName()) || !stackTraceElement3.getFileName().equals(stackTraceElement.getFileName()) || !stackTraceElement3.getMethodName().equals(stackTraceElement.getMethodName())) {
            return false;
        }
        if (stackTraceElement2 != null != this.IlIIIlIlIIIllIlIlIIl.length > 1) {
            return false;
        }
        if (stackTraceElement2 != null && !this.IlIIIlIlIIIllIlIlIIl[1].equals(stackTraceElement2)) {
            return false;
        }
        this.IlIIIlIlIIIllIlIlIIl[0] = stackTraceElement;
        return true;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        final StackTraceElement[] ilIIIlIlIIIllIlIlIIl = new StackTraceElement[this.IlIIIlIlIIIllIlIlIIl.length - n];
        System.arraycopy(this.IlIIIlIlIIIllIlIlIIl, 0, ilIIIlIlIIIllIlIlIIl, 0, ilIIIlIlIIIllIlIlIIl.length);
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final StringBuilder sb) {
        sb.append("-- ").append(this.IlIlIlIlIlllllllllIl).append(" --\n");
        sb.append("Details:");
        for (final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll : this.llIllIIIIIllIlIIIIlI) {
            sb.append("\n\t");
            sb.append(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll());
            sb.append(": ");
            sb.append(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl());
        }
        if (this.IlIIIlIlIIIllIlIlIIl != null && this.IlIIIlIlIIIllIlIlIIl.length > 0) {
            sb.append("\nStacktrace:");
            StackTraceElement[] ilIIIlIlIIIllIlIlIIl;
            for (int length = (ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl).length, i = 0; i < length; ++i) {
                final StackTraceElement stackTraceElement = ilIIIlIlIIIllIlIlIIl[i];
                sb.append("\n\tat ");
                sb.append(stackTraceElement.toString());
            }
        }
    }
    
    public StackTraceElement[] llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Block type", new llIIlIIIlIIIllIlIIIl(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), llllIIIIlIIIlIlllIll));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Block data value", new llIllIlIIIIllIlIIllI(n));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Block location", new lIlIlIIIllIIllIIIllI(ilIlIlIlIlllllllllIl));
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Block", new IlIlIIIllIIllIlllllI(llIIlIIIlIIIllIlIIIl));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Block location", new IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl));
    }
}
