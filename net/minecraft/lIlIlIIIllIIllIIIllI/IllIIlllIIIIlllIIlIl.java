package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.util.regex.*;
import com.google.common.base.*;
import com.google.common.collect.*;

class IllIIlllIIIIlllIIlIl extends llIllIIIIIllIlIIIIlI
{
    private static final Pattern llIllIIIIIllIlIIIIlI;
    private static final Pattern IlIIIlIlIIIllIlIlIIl;
    private static final Pattern IlIlIIIllIllIIIIIllI;
    private static final Pattern IllIIlllIIIIlllIIlIl;
    private static final Pattern llllIIIlIlllIlIIIIIl;
    private static final Pattern lIIIIlIIIIIlllIllIII;
    private static final Pattern lIIIlllIIIllIIIllIII;
    private static final Splitter llIIlIIIlIIIllIlIIIl;
    protected String IlIlIlIlIlllllllllIl;
    
    static {
        llIllIIIIIllIlIIIIlI = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[d|D]");
        IlIIIlIlIIIllIlIlIIl = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[f|F]");
        IlIlIIIllIllIIIIIllI = Pattern.compile("[-+]?[0-9]+[b|B]");
        IllIIlllIIIIlllIIlIl = Pattern.compile("[-+]?[0-9]+[l|L]");
        llllIIIlIlllIlIIIIIl = Pattern.compile("[-+]?[0-9]+[s|S]");
        lIIIIlIIIIIlllIllIII = Pattern.compile("[-+]?[0-9]+");
        lIIIlllIIIllIIIllIII = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");
        llIIlIIIlIIIllIlIIIl = Splitter.on(',').omitEmptyStrings();
    }
    
    public IllIIlllIIIIlllIIlIl(final String llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll() {
        try {
            if (net.minecraft.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.matcher(this.IlIlIlIlIlllllllllIl).matches()) {
                return new IIlllIIlIllIllIlIIll(Double.parseDouble(this.IlIlIlIlIlllllllllIl.substring(0, this.IlIlIlIlIlllllllllIl.length() - 1)));
            }
            if (net.minecraft.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.matcher(this.IlIlIlIlIlllllllllIl).matches()) {
                return new IlIlIIIIIIlllIlIllIl(Float.parseFloat(this.IlIlIlIlIlllllllllIl.substring(0, this.IlIlIlIlIlllllllllIl.length() - 1)));
            }
            if (net.minecraft.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI.matcher(this.IlIlIlIlIlllllllllIl).matches()) {
                return new lIlIlIIIllIIllIIIllI(Byte.parseByte(this.IlIlIlIlIlllllllllIl.substring(0, this.IlIlIlIlIlllllllllIl.length() - 1)));
            }
            if (net.minecraft.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.matcher(this.IlIlIlIlIlllllllllIl).matches()) {
                return new IlllllllIIIlIIIlIlII(Long.parseLong(this.IlIlIlIlIlllllllllIl.substring(0, this.IlIlIlIlIlllllllllIl.length() - 1)));
            }
            if (net.minecraft.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.matcher(this.IlIlIlIlIlllllllllIl).matches()) {
                return new IIlIIIIlllIlllllIlII(Short.parseShort(this.IlIlIlIlIlllllllllIl.substring(0, this.IlIlIlIlIlllllllllIl.length() - 1)));
            }
            if (net.minecraft.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.matcher(this.IlIlIlIlIlllllllllIl).matches()) {
                return new IIllIIllIIIlIlIIIIlI(Integer.parseInt(this.IlIlIlIlIlllllllllIl));
            }
            if (net.minecraft.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII.matcher(this.IlIlIlIlIlllllllllIl).matches()) {
                return new IIlllIIlIllIllIlIIll(Double.parseDouble(this.IlIlIlIlIlllllllllIl));
            }
            if (this.IlIlIlIlIlllllllllIl.equalsIgnoreCase("true") || this.IlIlIlIlIlllllllllIl.equalsIgnoreCase("false")) {
                return new lIlIlIIIllIIllIIIllI((byte)(Boolean.parseBoolean(this.IlIlIlIlIlllllllllIl) ? 1 : 0));
            }
        }
        catch (NumberFormatException ex) {
            this.IlIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl.replaceAll("\\\\\"", "\"");
            return new IIIlIIlIIIIlllIlllII(this.IlIlIlIlIlllllllllIl);
        }
        if (this.IlIlIlIlIlllllllllIl.startsWith("[") && this.IlIlIlIlIlllllllllIl.endsWith("]")) {
            final String[] array = (String[])Iterables.toArray(net.minecraft.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.split((CharSequence)this.IlIlIlIlIlllllllllIl.substring(1, this.IlIlIlIlIlllllllllIl.length() - 1)), (Class)String.class);
            try {
                final int[] array2 = new int[array.length];
                for (int i = 0; i < array.length; ++i) {
                    array2[i] = Integer.parseInt(array[i].trim());
                }
                return new IIIlIIIlIlIIlllIIlll(array2);
            }
            catch (NumberFormatException ex2) {
                return new IIIlIIlIIIIlllIlllII(this.IlIlIlIlIlllllllllIl);
            }
        }
        if (this.IlIlIlIlIlllllllllIl.startsWith("\"") && this.IlIlIlIlIlllllllllIl.endsWith("\"")) {
            this.IlIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl.substring(1, this.IlIlIlIlIlllllllllIl.length() - 1);
        }
        this.IlIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl.replaceAll("\\\\\"", "\"");
        final StringBuilder sb = new StringBuilder();
        for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length(); ++j) {
            if (j < this.IlIlIlIlIlllllllllIl.length() - 1 && this.IlIlIlIlIlllllllllIl.charAt(j) == '\\' && this.IlIlIlIlIlllllllllIl.charAt(j + 1) == '\\') {
                sb.append('\\');
                ++j;
            }
            else {
                sb.append(this.IlIlIlIlIlllllllllIl.charAt(j));
            }
        }
        return new IIIlIIlIIIIlllIlllII(sb.toString());
    }
}
