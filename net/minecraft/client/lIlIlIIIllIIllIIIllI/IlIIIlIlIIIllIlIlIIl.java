package net.minecraft.client.lIlIlIIIllIIllIIIllI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import org.lwjgl.util.vector.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import com.google.common.collect.*;
import com.google.common.base.*;
import org.apache.commons.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IIIIlllIIIIIIlIIIlll.*;
import com.google.gson.*;
import java.util.*;
import java.io.*;
import org.lwjgl.opengl.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl;
    private String llIllIIIIIllIlIIIIlI;
    private final List IlIIIlIlIIIllIlIlIIl;
    private final Map IlIlIIIllIllIIIIIllI;
    private final List IllIIlllIIIIlllIIlIl;
    private Matrix4f llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private float llIIlIIIlIIIllIlIIIl;
    private float llIllIlIIIIllIlIIllI;
    
    public IlIIIlIlIIIllIlIlIIl(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final IlIlIIIllIIllIlllllI ilIlIlIlIlllllllllIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = Maps.newHashMap();
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = lIllllIllIllIIllllll.toString();
        this.llIllIIIIIllIlIIIIlI();
        this.llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll, lIllllIllIllIIllllll);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final JsonParser jsonParser = new JsonParser();
        InputStream ilIlIlIlIlllllllllIl = null;
        try {
            ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll).IlIlIlIlIlllllllllIl();
            final JsonObject asJsonObject = jsonParser.parse(IOUtils.toString(ilIlIlIlIlllllllllIl, Charsets.UTF_8)).getAsJsonObject();
            if (IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI(asJsonObject, "targets")) {
                final JsonArray asJsonArray = asJsonObject.getAsJsonArray("targets");
                int n = 0;
                for (final JsonElement jsonElement : asJsonArray) {
                    try {
                        this.llllIIIIlIIIlIlllIll(jsonElement);
                    }
                    catch (Exception ex) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex);
                        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("targets[" + n + "]");
                        throw llllIIIIlIIIlIlllIll;
                    }
                    ++n;
                }
            }
            if (IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI(asJsonObject, "passes")) {
                final JsonArray asJsonArray2 = asJsonObject.getAsJsonArray("passes");
                int n2 = 0;
                for (final JsonElement jsonElement2 : asJsonArray2) {
                    try {
                        this.llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll, jsonElement2);
                    }
                    catch (Exception ex2) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex2);
                        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("passes[" + n2 + "]");
                        throw llllIIIIlIIIlIlllIll2;
                    }
                    ++n2;
                }
            }
        }
        catch (Exception ex3) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex3);
            llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
            throw llllIIIIlIIIlIlllIll3;
        }
        finally {
            IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
        }
        IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
    }
    
    private void llllIIIIlIIIlIlllIll(final JsonElement jsonElement) {
        if (IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonElement)) {
            this.llllIIIIlIIIlIlllIll(jsonElement.getAsString(), this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII);
        }
        else {
            final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "target");
            final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "name");
            final int llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "width", this.lIIIIlIIIIIlllIllIII);
            final int llllIIIIlIIIlIlllIll2 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "height", this.lIIIlllIIIllIIIllIII);
            if (this.IlIlIIIllIllIIIIIllI.containsKey(illIIlllIIIIlllIIlIl)) {
                throw new IlIlIlIlIlllllllllIl(String.valueOf(illIIlllIIIIlllIIlIl) + " is already defined");
            }
            this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final JsonElement jsonElement) {
        final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "pass");
        final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "name");
        final String illIIlllIIIIlllIIlIl2 = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "intarget");
        final String illIIlllIIIIlllIIlIl3 = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "outtarget");
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl2);
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl3);
        if (ilIlIlIlIlllllllllIl == null) {
            throw new IlIlIlIlIlllllllllIl("Input target '" + illIIlllIIIIlllIIlIl2 + "' does not exist");
        }
        if (ilIlIlIlIlllllllllIl2 == null) {
            throw new IlIlIlIlIlllllllllIl("Output target '" + illIIlllIIIIlllIIlIl3 + "' does not exist");
        }
        final net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
        final JsonArray llllIIIIlIIIlIlllIll2 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "auxtargets", (JsonArray)null);
        if (llllIIIIlIIIlIlllIll2 != null) {
            int n = 0;
            for (final JsonElement jsonElement2 : llllIIIIlIIIlIlllIll2) {
                try {
                    final JsonObject ilIlIIIllIllIIIIIllI2 = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement2, "auxtarget");
                    final String illIIlllIIIIlllIIlIl4 = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI2, "name");
                    final String illIIlllIIIIlllIIlIl5 = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI2, "id");
                    final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl3 = this.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl5);
                    if (ilIlIlIlIlllllllllIl3 == null) {
                        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll("textures/effect/" + illIIlllIIIIlllIIlIl5 + ".png");
                        try {
                            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                        }
                        catch (FileNotFoundException ex3) {
                            throw new IlIlIlIlIlllllllllIl("Render target or texture '" + illIIlllIIIIlllIIlIl5 + "' does not exist");
                        }
                        illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl4 = illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll);
                        final int liiIlllIIIllIIIllIII = IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI2, "width");
                        final int liiIlllIIIllIIIllIII2 = IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI2, "height");
                        if (IIlllllIllIllIlIlIII.llllIIIlIlllIlIIIIIl(ilIlIIIllIllIIIIIllI2, "bilinear")) {
                            GL11.glTexParameteri(3553, 10241, 9729);
                            GL11.glTexParameteri(3553, 10240, 9729);
                        }
                        else {
                            GL11.glTexParameteri(3553, 10241, 9728);
                            GL11.glTexParameteri(3553, 10240, 9728);
                        }
                        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl4, ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(), liiIlllIIIllIIIllIII, liiIlllIIIllIIIllIII2);
                    }
                    else {
                        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl4, ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl3.IlIlIlIlIlllllllllIl);
                    }
                }
                catch (Exception ex) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex);
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("auxtargets[" + n + "]");
                    throw llllIIIIlIIIlIlllIll3;
                }
                ++n;
            }
        }
        final JsonArray llllIIIIlIIIlIlllIll4 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "uniforms", (JsonArray)null);
        if (llllIIIIlIIIlIlllIll4 != null) {
            int n2 = 0;
            for (final JsonElement jsonElement3 : llllIIIIlIIIlIlllIll4) {
                try {
                    this.IlIlIlIlIlllllllllIl(jsonElement3);
                }
                catch (Exception ex2) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll5 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex2);
                    llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll("uniforms[" + n2 + "]");
                    throw llllIIIIlIIIlIlllIll5;
                }
                ++n2;
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final JsonElement jsonElement) {
        final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "uniform");
        final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "name");
        final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.get(this.IlIIIlIlIIIllIlIlIIl.size() - 1).IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        if (llllIIIIlIIIlIlllIll == null) {
            throw new IlIlIlIlIlllllllllIl("Uniform '" + illIIlllIIIIlllIIlIl + "' does not exist");
        }
        final float[] array = new float[4];
        int n = 0;
        for (final JsonElement jsonElement2 : IIlllllIllIllIlIlIII.llIllIlIIIIllIlIIllI(ilIlIIIllIllIIIIIllI, "values")) {
            try {
                array[n] = IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI(jsonElement2, "value");
            }
            catch (Exception ex) {
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.client.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ex);
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("values[" + n + "]");
                throw llllIIIIlIIIlIlllIll2;
            }
            ++n;
        }
        switch (n) {
            case 1: {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[0]);
                break;
            }
            case 2: {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[0], array[1]);
                break;
            }
            case 3: {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[0], array[1], array[2]);
                break;
            }
            case 4: {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[0], array[1], array[2], array[3]);
                break;
            }
        }
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final String s) {
        return this.IlIlIIIllIllIIIIIllI.get(s);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll(n, n2, true);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.0f);
        this.IlIlIIIllIllIIIIIllI.put(s, llllIIIIlIIIlIlllIll);
        if (n == this.lIIIIlIIIIIlllIllIII && n2 == this.lIIIlllIIIllIIIllIII) {
            this.IllIIlllIIIIlllIIlIl.add(llllIIIIlIIIlIlllIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final Iterator<llllIIIIlIIIlIlllIll> iterator = this.IlIlIIIllIllIIIIIllI.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll();
        }
        final Iterator<net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl> iterator2 = this.IlIIIlIlIIIllIlIlIIl.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().llllIIIIlIIIlIlllIll();
        }
        this.IlIIIlIlIIIllIlIlIIl.clear();
    }
    
    public net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final String s, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        final net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, s, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        this.IlIIIlIlIIIllIlIlIIl.add(this.IlIIIlIlIIIllIlIlIIl.size(), ilIlIlIlIlllllllllIl);
        return ilIlIlIlIlllllllllIl;
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        (this.llllIIIlIlllIlIIIIIl = new Matrix4f()).setIdentity();
        this.llllIIIlIlllIlIIIIIl.m00 = 2.0f / this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.llllIIIlIlllIlIIIIIl.m11 = 2.0f / -this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.llllIIIlIlllIlIIIIIl.m22 = -0.0020001999f;
        this.llllIIIlIlllIlIIIIIl.m33 = 1.0f;
        this.llllIIIlIlllIlIIIIIl.m03 = -1.0f;
        this.llllIIIlIlllIlIIIIIl.m13 = 1.0f;
        this.llllIIIlIlllIlIIIIIl.m23 = -1.0001999f;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.lIIIlllIIIllIIIllIII = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI();
        final Iterator<net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl> iterator = this.IlIIIlIlIIIllIlIlIIl.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        }
        final Iterator<llllIIIIlIIIlIlllIll> iterator2 = this.IllIIlllIIIIlllIIlIl.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().llllIIIIlIIIlIlllIll(n, n2);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final float llIllIlIIIIllIlIIllI) {
        if (llIllIlIIIIllIlIIllI < this.llIllIlIIIIllIlIIllI) {
            this.llIIlIIIlIIIllIlIIIl += 1.0f - this.llIllIlIIIIllIlIIllI;
            this.llIIlIIIlIIIllIlIIIl += llIllIlIIIIllIlIIllI;
        }
        else {
            this.llIIlIIIlIIIllIlIIIl += llIllIlIIIIllIlIIllI - this.llIllIlIIIIllIlIIllI;
        }
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        while (this.llIIlIIIlIIIllIlIIIl > 20.0f) {
            this.llIIlIIIlIIIllIlIIIl -= 20.0f;
        }
        final Iterator<net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl> iterator = this.IlIIIlIlIIIllIlIlIIl.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl / 20.0f);
        }
    }
    
    public final String IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    private llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final String s) {
        return (s == null) ? null : (s.equals("minecraft:main") ? this.llllIIIIlIIIlIlllIll : this.IlIlIIIllIllIIIIIllI.get(s));
    }
}
