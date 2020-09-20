package p000s.p001h.p002e.p003l.p004l;

import android.app.Application;
import android.content.pm.ApplicationInfo;

/* renamed from: s.h.e.l.l.N */
public final class C0003N {

    /* renamed from: la */
    static boolean f0la = true;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[SYNTHETIC, Splitter:B:19:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC, Splitter:B:22:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065 A[SYNTHETIC, Splitter:B:28:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a A[SYNTHETIC, Splitter:B:31:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    static {
        /*
            r1 = 0
            r0 = 1
            f0la = r0
            r3 = 0
            java.lang.Object r0 = new java.lang.Object     // Catch:{ Exception -> 0x0052, all -> 0x0061 }
            r0.<init>()     // Catch:{ Exception -> 0x0052, all -> 0x0061 }
            java.lang.Object r2 = new java.lang.Object     // Catch:{ Exception -> 0x008c, all -> 0x0087 }
            r2.<init>()     // Catch:{ Exception -> 0x008c, all -> 0x0087 }
            if (r0 == 0) goto L_0x0014
            r0.hashCode()     // Catch:{ Exception -> 0x0083 }
        L_0x0014:
            if (r2 == 0) goto L_0x0019
            r2.hashCode()     // Catch:{ Exception -> 0x0085 }
        L_0x0019:
            boolean r0 = f0la
            if (r0 == 0) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = p000s.p001h.p002e.p003l.p004l.C0004S.f5p
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "/libexec.so"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.System.load(r0)
            boolean r0 = p000s.p001h.p002e.p003l.p004l.C0004S.f3m
            if (r0 == 0) goto L_0x0051
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = p000s.p001h.p002e.p003l.p004l.C0004S.f5p
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "/libexecmain.so"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.System.load(r0)
        L_0x0051:
            return
        L_0x0052:
            r0 = move-exception
            r0 = r1
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r0.hashCode()     // Catch:{ Exception -> 0x007d }
        L_0x0059:
            if (r1 == 0) goto L_0x0019
            r3.hashCode()     // Catch:{ Exception -> 0x005f }
            goto L_0x0019
        L_0x005f:
            r0 = move-exception
            goto L_0x0019
        L_0x0061:
            r0 = move-exception
            r2 = r1
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.hashCode()     // Catch:{ Exception -> 0x007f }
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r3.hashCode()     // Catch:{ Exception -> 0x0081 }
        L_0x006d:
            throw r0
        L_0x006e:
            java.lang.String r0 = "exec"
            java.lang.System.loadLibrary(r0)
            boolean r0 = p000s.p001h.p002e.p003l.p004l.C0004S.f3m
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "execmain"
            java.lang.System.loadLibrary(r0)
            goto L_0x0051
        L_0x007d:
            r0 = move-exception
            goto L_0x0059
        L_0x007f:
            r2 = move-exception
            goto L_0x0068
        L_0x0081:
            r1 = move-exception
            goto L_0x006d
        L_0x0083:
            r0 = move-exception
            goto L_0x0014
        L_0x0085:
            r0 = move-exception
            goto L_0x0019
        L_0x0087:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L_0x0063
        L_0x008c:
            r2 = move-exception
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: p000s.p001h.p002e.p003l.p004l.C0003N.<clinit>():void");
    }

    /* renamed from: al */
    public static native ClassLoader m3al(ClassLoader classLoader, ApplicationInfo applicationInfo, String str, String str2);

    public static native byte[] b2b(byte[] bArr, int i);

    /* renamed from: l */
    public static native boolean m4l(Application application, String str);

    /* renamed from: m */
    public static native void m5m(String str, int i);

    /* renamed from: r */
    public static native boolean m6r(Application application, String str);

    /* renamed from: ra */
    public static native boolean m7ra(Application application, String str);

    /* renamed from: sa */
    public static native void m8sa(String str, String str2);
}
