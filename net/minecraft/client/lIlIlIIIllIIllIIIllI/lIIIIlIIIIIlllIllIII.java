package net.minecraft.client.lIlIlIIIllIIllIIIllI;

import org.apache.logging.log4j.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import com.google.common.collect.*;
import com.google.common.base.*;
import org.apache.commons.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IIIIlllIIIIIIlIIIlll.*;
import com.google.gson.*;
import java.io.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class lIIIIlIIIIIlllIllIII
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl;
    private static lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI;
    private static int IlIIIlIlIIIllIlIlIIl;
    private static boolean IlIlIIIllIllIIIIIllI;
    private final Map IllIIlllIIIIlllIIlIl;
    private final List llllIIIlIlllIlIIIIIl;
    private final List lIIIIlIIIIIlllIllIII;
    private final List lIIIlllIIIllIIIllIII;
    private final List llIIlIIIlIIIllIlIIIl;
    private final Map llIllIlIIIIllIlIIllI;
    private final int lIlIlIIIllIIllIIIllI;
    private final String IlIlIIIllIIllIlllllI;
    private final boolean IIIIlllIIIIIIlIIIlll;
    private boolean llllIIllllIlIlIIIIll;
    private final llllIIIIlIIIlIlllIll IlIllIlIlIIIlIlIlIII;
    private final List IIlllIIlIllIllIlIIll;
    private final List lllIIIIlllllIlIIllIl;
    private final IllIIlllIIIIlllIIlIl IlIlIIIIIIlllIlIllIl;
    private final IllIIlllIIIIlllIIlIl IIllIIllIIIlIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIlIlIlllllllllIl = new llIllIIIIIllIlIIIIlI();
        lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI = null;
        lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = -1;
        lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI = true;
    }
    
    public lIIIIlIIIIIlllIllIII(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final String ilIlIIIllIIllIlllllI2) {
        this.IllIIlllIIIIlllIIlIl = Maps.newHashMap();
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
        this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
        this.lIIIlllIIIllIIIllIII = Lists.newArrayList();
        this.llIIlIIIlIIIllIlIIIl = Lists.newArrayList();
        this.llIllIlIIIIllIlIIllI = Maps.newHashMap();
        final JsonParser jsonParser = new JsonParser();
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll("shaders/program/" + ilIlIIIllIIllIlllllI2 + ".json");
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI2;
        InputStream ilIlIlIlIlllllllllIl = null;
        try {
            ilIlIlIlIlllllllllIl = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll).IlIlIlIlIlllllllllIl();
            final JsonObject asJsonObject = jsonParser.parse(IOUtils.toString(ilIlIlIlIlllllllllIl, Charsets.UTF_8)).getAsJsonObject();
            final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(asJsonObject, "vertex");
            final String illIIlllIIIIlllIIlIl2 = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(asJsonObject, "fragment");
            final JsonArray llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "samplers", (JsonArray)null);
            if (llllIIIIlIIIlIlllIll != null) {
                int n = 0;
                for (final JsonElement jsonElement : llllIIIIlIIIlIlllIll) {
                    try {
                        this.llllIIIIlIIIlIlllIll(jsonElement);
                    }
                    catch (Exception ex) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex);
                        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("samplers[" + n + "]");
                        throw llllIIIIlIIIlIlllIll2;
                    }
                    ++n;
                }
            }
            final JsonArray llllIIIIlIIIlIlllIll3 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "attributes", (JsonArray)null);
            if (llllIIIIlIIIlIlllIll3 != null) {
                int n2 = 0;
                this.IIlllIIlIllIllIlIIll = Lists.newArrayListWithCapacity(llllIIIIlIIIlIlllIll3.size());
                this.lllIIIIlllllIlIIllIl = Lists.newArrayListWithCapacity(llllIIIIlIIIlIlllIll3.size());
                for (final JsonElement jsonElement2 : llllIIIIlIIIlIlllIll3) {
                    try {
                        this.lllIIIIlllllIlIIllIl.add(IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonElement2, "attribute"));
                    }
                    catch (Exception ex2) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex2);
                        llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("attributes[" + n2 + "]");
                        throw llllIIIIlIIIlIlllIll4;
                    }
                    ++n2;
                }
            }
            else {
                this.IIlllIIlIllIllIlIIll = null;
                this.lllIIIIlllllIlIIllIl = null;
            }
            final JsonArray llllIIIIlIIIlIlllIll5 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "uniforms", (JsonArray)null);
            if (llllIIIIlIIIlIlllIll5 != null) {
                int n3 = 0;
                for (final JsonElement jsonElement3 : llllIIIIlIIIlIlllIll5) {
                    try {
                        this.IlIlIlIlIlllllllllIl(jsonElement3);
                    }
                    catch (Exception ex3) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll6 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex3);
                        llllIIIIlIIIlIlllIll6.llllIIIIlIIIlIlllIll("uniforms[" + n3 + "]");
                        throw llllIIIIlIIIlIlllIll6;
                    }
                    ++n3;
                }
            }
            this.IlIllIlIlIIIlIlIlIII = net.minecraft.client.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "blend", (JsonObject)null));
            this.IIIIlllIIIIIIlIIIlll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "cull", true);
            this.IlIlIIIIIIlllIlIllIl = net.minecraft.client.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl);
            this.IIllIIllIIIlIlIIIIlI = net.minecraft.client.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, illIIlllIIIIlllIIlIl2);
            this.lIlIlIIIllIIllIIIllI = net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI();
            net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl(this);
            this.lIIIIlIIIIIlllIllIII();
            if (this.lllIIIIlllllIlIIllIl != null) {
                final Iterator<String> iterator4 = (Iterator<String>)this.lllIIIIlllllIlIIllIl.iterator();
                while (iterator4.hasNext()) {
                    this.IIlllIIlIllIllIlIIll.add(lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI, iterator4.next()));
                }
            }
        }
        catch (Exception ex4) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll7 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex4);
            llllIIIIlIIIlIlllIll7.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
            throw llllIIIIlIIIlIlllIll7;
        }
        finally {
            IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
        }
        IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
        this.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(this);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl(0);
        net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = -1;
        net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI = null;
        net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI = true;
        for (int i = 0; i < this.lIIIIlIIIIIlllIllIII.size(); ++i) {
            if (this.IllIIlllIIIIlllIIlIl.get(this.llllIIIlIlllIlIIIIIl.get(i)) != null) {
                lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll + i);
                lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
            }
        }
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIllllIlIlIIIIll = false;
        net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI = this;
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll();
        if (this.lIlIlIIIllIIllIIIllI != net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl) {
            lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl(this.lIlIlIIIllIIllIIIllI);
            net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = this.lIlIlIIIllIIllIIIllI;
        }
        if (this.IIIIlllIIIIIIlIIIlll) {
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        }
        else {
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        }
        for (int i = 0; i < this.lIIIIlIIIIIlllIllIII.size(); ++i) {
            if (this.IllIIlllIIIIlllIIlIl.get(this.llllIIIlIlllIlIIIIIl.get(i)) != null) {
                lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll + i);
                lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                final Object value = this.IllIIlllIIIIlllIIlIl.get(this.llllIIIlIlllIlIIIIIl.get(i));
                int n = -1;
                if (value instanceof net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll) {
                    n = ((net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll)value).llllIIIlIlllIlIIIIIl;
                }
                else if (value instanceof IlIIIlIlIIIllIlIlIIl) {
                    n = ((IlIIIlIlIIIllIlIlIIl)value).llllIIIIlIIIlIlllIll();
                }
                else if (value instanceof Integer) {
                    n = (int)value;
                }
                if (n != -1) {
                    lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(n);
                    lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl(lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, (CharSequence)this.llllIIIlIlllIlIIIIIl.get(i)), i);
                }
            }
        }
        final Iterator<lIIIlllIIIllIIIllIII> iterator = this.lIIIlllIIIllIIIllIII.iterator();
        while (iterator.hasNext()) {
            iterator.next().IlIlIlIlIlllllllllIl();
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIllllIlIlIIIIll = true;
    }
    
    public lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final String s) {
        return this.llIllIlIIIIllIlIIllI.containsKey(s) ? this.llIllIlIIIIllIlIIllI.get(s) : null;
    }
    
    public lIIIlllIIIllIIIllIII IlIlIlIlIlllllllllIl(final String s) {
        return this.llIllIlIIIIllIlIIllI.containsKey(s) ? this.llIllIlIIIIllIlIIllI.get(s) : net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl;
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        for (int i = 0, n = 0; i < this.llllIIIlIlllIlIIIIIl.size(); ++i, ++n) {
            final String s = this.llllIIIlIlllIlIIIIIl.get(i);
            final int llllIIIIlIIIlIlllIll = lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, s);
            if (llllIIIIlIIIlIlllIll == -1) {
                net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.warn("Shader " + this.IlIlIIIllIIllIlllllI + "could not find sampler named " + s + " in the specified shader program.");
                this.IllIIlllIIIIlllIIlIl.remove(s);
                this.llllIIIlIlllIlIIIIIl.remove(n);
                --n;
            }
            else {
                this.lIIIIlIIIIIlllIllIII.add(llllIIIIlIIIlIlllIll);
            }
        }
        for (final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII : this.lIIIlllIIIllIIIllIII) {
            final String llllIIIIlIIIlIlllIll2 = liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll();
            final int llllIIIIlIIIlIlllIll3 = lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll2);
            if (llllIIIIlIIIlIlllIll3 == -1) {
                net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.warn("Could not find uniform named " + llllIIIIlIIIlIlllIll2 + " in the specified" + " shader program.");
            }
            else {
                this.llIIlIIIlIIIllIlIIIl.add(llllIIIIlIIIlIlllIll3);
                liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                this.llIllIlIIIIllIlIIllI.put(llllIIIIlIIIlIlllIll2, liiIlllIIIllIIIllIII);
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final JsonElement jsonElement) {
        final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "sampler");
        final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "name");
        if (!IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "file")) {
            this.IllIIlllIIIIlllIIlIl.put(illIIlllIIIIlllIIlIl, null);
            this.llllIIIlIlllIlIIIIIl.add(illIIlllIIIIlllIIlIl);
        }
        else {
            this.llllIIIlIlllIlIIIIIl.add(illIIlllIIIIlllIIlIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final Object o) {
        if (this.IllIIlllIIIIlllIIlIl.containsKey(s)) {
            this.IllIIlllIIIIlllIIlIl.remove(s);
        }
        this.IllIIlllIIIIlllIIlIl.put(s, o);
        this.IlIIIlIlIIIllIlIlIIl();
    }
    
    private void IlIlIlIlIlllllllllIl(final JsonElement jsonElement) {
        final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "uniform");
        final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "name");
        final int llllIIIIlIIIlIlllIll = net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "type"));
        final int liiIlllIIIllIIIllIII = IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI, "count");
        final float[] array = new float[Math.max(liiIlllIIIllIIIllIII, 16)];
        final JsonArray llIllIlIIIIllIlIIllI = IIlllllIllIllIlIlIII.llIllIlIIIIllIlIIllI(ilIlIIIllIllIIIIIllI, "values");
        if (llIllIlIIIIllIlIIllI.size() != liiIlllIIIllIIIllIII && llIllIlIIIIllIlIIllI.size() > 1) {
            throw new IlIlIlIlIlllllllllIl("Invalid amount of values specified (expected " + liiIlllIIIllIIIllIII + ", found " + llIllIlIIIIllIlIIllI.size() + ")");
        }
        int i = 0;
        for (final JsonElement jsonElement2 : llIllIlIIIIllIlIIllI) {
            try {
                array[i] = IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI(jsonElement2, "value");
            }
            catch (Exception ex) {
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex);
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("values[" + i + "]");
                throw llllIIIIlIIIlIlllIll2;
            }
            ++i;
        }
        if (liiIlllIIIllIIIllIII > 1 && llIllIlIIIIllIlIIllI.size() == 1) {
            while (i < liiIlllIIIllIIIllIII) {
                array[i] = array[0];
                ++i;
            }
        }
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2 = new lIIIlllIIIllIIIllIII(illIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll + ((liiIlllIIIllIIIllIII > 1 && liiIlllIIIllIIIllIII <= 4 && llllIIIIlIIIlIlllIll < 8) ? (liiIlllIIIllIIIllIII - 1) : 0), liiIlllIIIllIIIllIII, this);
        if (llllIIIIlIIIlIlllIll <= 3) {
            liiIlllIIIllIIIllIII2.llllIIIIlIIIlIlllIll((int)array[0], (int)array[1], (int)array[2], (int)array[3]);
        }
        else if (llllIIIIlIIIlIlllIll <= 7) {
            liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl(array[0], array[1], array[2], array[3]);
        }
        else {
            liiIlllIIIllIIIllIII2.llllIIIIlIIIlIlllIll(array);
        }
        this.lIIIlllIIIllIIIllIII.add(liiIlllIIIllIIIllIII2);
    }
    
    public IllIIlllIIIIlllIIlIl IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
}
