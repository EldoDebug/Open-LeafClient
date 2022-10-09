package net.minecraft.IlIlIlIlIlllllllllIl;

import org.apache.logging.log4j.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import org.apache.commons.lang3.exception.*;
import com.google.gson.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIllllIIIlIIIIIIllIl extends llllIIIIlIIIlIlllIll
{
    private static final Logger llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "title";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.title.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 2) {
            throw new llllIllllIllllIlIlII("commands.title.usage", new Object[0]);
        }
        if (array.length < 3) {
            if ("title".equals(array[1]) || "subtitle".equals(array[1])) {
                throw new llllIllllIllllIlIlII("commands.title.usage.title", new Object[0]);
            }
            if ("times".equals(array[1])) {
                throw new llllIllllIllllIlIlII("commands.title.usage.times", new Object[0]);
            }
        }
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[0]);
        final IIIllIIllIIIIIIlIIlI llllIIIIlIIIlIlllIll2 = IIIllIIllIIIIIIlIIlI.llllIIIIlIIIlIlllIll(array[1]);
        if (llllIIIIlIIIlIlllIll2 != IIIllIIllIIIIIIlIIlI.IlIIIlIlIIIllIlIlIIl && llllIIIIlIIIlIlllIll2 != IIIllIIllIIIIIIlIIlI.IlIlIIIllIllIIIIIllI) {
            if (llllIIIIlIIIlIlllIll2 == IIIllIIllIIIIIIlIIlI.llIllIIIIIllIlIIIIlI) {
                if (array.length != 5) {
                    throw new llllIllllIllllIlIlII("commands.title.usage", new Object[0]);
                }
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIllIIIlIIIIlIIlIIII(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2]), net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[3]), net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[4])));
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.title.success", new Object[0]);
            }
            else {
                if (array.length < 3) {
                    throw new llllIllllIllllIlIlII("commands.title.usage", new Object[0]);
                }
                final String llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 2);
                llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll4;
                try {
                    llllIIIIlIIIlIlllIll4 = lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                }
                catch (JsonParseException ex) {
                    final Throwable rootCause = ExceptionUtils.getRootCause((Throwable)ex);
                    throw new IIlllllIllIllIlIlIII("commands.tellraw.jsonException", new Object[] { (rootCause == null) ? "" : rootCause.getMessage() });
                }
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIllIIIlIIIIlIIlIIII(llllIIIIlIIIlIlllIll2, IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll)));
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.title.success", new Object[0]);
            }
        }
        else {
            if (array.length != 2) {
                throw new llllIllllIllllIlIlII("commands.title.usage", new Object[0]);
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIllIIIlIIIIlIIlIIII(llllIIIIlIIIlIlllIll2, null));
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.title.success", new Object[0]);
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI()) : ((array.length == 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, IIIllIIllIIIIIIlIIlI.llllIIIIlIIIlIlllIll()) : null);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
}
