/**
 * Created by Administrator on 2014/9/1.
 */

var tooltipOptions =
{
    showDelay: 10,
    hideDelay: 300,
    effect: "slide",
    duration: 200,
    relativeTo: "element",
    position: 0,
    smartPosition: true,
    offsetX: 0,
    offsetY: 12,
    maxWidth: 400,
    calloutSize: 6,
    calloutPosition: 0.5,
    sticky: false,
    overlay: false,
    license: "241l9"
};


var tooltip = function(z) {
    var i = "length",
        Gb = "addEventListener",
        U, gc, Nb = function() {},
        sb = function(a, c, b) {
            if (a[Gb]) a[Gb](c, b, false);
            else a.attachEvent && a.attachEvent("on" + c, b)
        },
        c = {},
        O = function(a) {
            if (a && a.stopPropagation) a.stopPropagation();
            else if (a && typeof a.cancelBubble != "undefined") a.cancelBubble = true
        },
        fc = function(b) {
            var a = b ? b : window.event;
            if (a.preventDefault) a.preventDefault();
            else if (a) a.returnValue = false
        },
        Yb = function(d) {
            var a = d.childNodes,
                c = [];
            if (a) for (var b = 0, e = a[i]; b < e; b++) a[b].nodeType == 1 && c.push(a[b]);
            return c
        },
        bb = {
            a: 0,
            b: 0
        },
        g = null,
        cc = function(a) {
            if (!a) a = window.event;
            bb.a = a.clientX;
            bb.b = a.clientY
        },
        ac = function(b) {
            if (window.getComputedStyle) var c = window.getComputedStyle(b, null);
            else if (b.currentStyle) c = b.currentStyle;
            else c = b[a];
            return c
        },
        A = "offsetLeft",
        D = "offsetTop",
        rb = "clientWidth",
        qb = "clientHeight",
        y = "appendChild",
        Y = "display",
        r = "border",
        I = "opacity",
        T = 0,
        N = "createElement",
        ob = "getElementsByTagName",
        E = "parentNode",
        W = "calloutSize",
        Q = "position",
        Hb = "calloutPosition",
        m = Math.round,
        lb = "overlay",
        F = "sticky",
        V = "hideDelay",
        fb = "onmouseout",
        kb = "onclick",
        Kb = function() {
            this.a = [];
            this.b = null
        },
        H = "firstChild",
        xb = 0,
        x = document,
        L = "getElementById",
        Z = navigator,
        P = "innerHTML",
        l = function(a, b) {
            return b ? x[a](b) : x[a]
        },
        Ib = function() {
            var c = 50,
                b = Z.userAgent,
                a;
            if ((a = b.indexOf("MSIE ")) != -1) c = parseInt(b.substring(a + 5, b.indexOf(".", a)));
            return c
        },
        wb = Ib() < 9,
        Ab = !! Z.msMaxTouchPoints,
        db = !! ("ontouchstart" in window || window.DocumentTouch && document instanceof DocumentTouch),
        Lb = (Z.msPointerEnabled || Z.pointerEnabled) && Ab;
    if (Lb) var Vb = Z.msPointerEnabled ? "onmspointerout" : "onpointerOut";
    var Qb = function(a) {
            return a.pointerType == a.MSPOINTER_TYPE_MOUSE || a.pointerType == "mouse"
        },
        C = "marginTop",
        ib = "marginLeft",
        u = "offsetWidth",
        t = "offsetHeight",
        vb = "documentElement",
        X = "borderColor",
        tb = "nextSibling",
        a = "style",
        p = "visibility",
        J = "width",
        w = "left",
        q = "top",
        S = "height",
        ec = ["$1$2$3", "$1$2$3", "$1$24", "$1$23", "$1$22"],
        v, pb, B = function(c, a, b) {
            return setTimeout(c, a ? a.showDelay : b)
        },
        eb = function(a) {
            clearTimeout(a);
            return null
        };
    Kb.prototype = {
        d: {
            b: Nb,
            c: function(a) {
                return -Math.cos(a * Math.PI) / 2 + .5
            }
        },
        e: function(i, d, h, f) {
            for (var a = [], g = h - d, c = Math.ceil((k.duration || 9) / 15), e, b = 1; b <= c; b++) {
                e = d + f.c(b / c) * g;
                a.push(e)
            }
            a.d = 0;
            return a
        },
        f: function() {
            this.b == null && this.g()
        },
        g: function() {
            this.h();
            var a = this;
            this.b = setInterval(function() {
                a.h()
            }, 15)
        },
        h: function() {
            var a = this.a[i];
            if (a) {
                for (var c = 0; c < a; c++) this.i(this.a[c]);
                while (a--) {
                    var b = this.a[a];
                    if (b.c.d == b.c[i]) {
                        b.d();
                        this.a.splice(a, 1)
                    }
                }
            } else {
                clearInterval(this.b);
                this.b = null
            }
        },
        i: function(b) {
            if (b.c.d < b.c[i]) {
                var d = b.b,
                    c = b.c[b.c.d];
                if (b.b == I) {
                    b.a.op = c;
                    if (wb) {
                        d = "filter";
                        c = "alpha(opacity=" + m(c * 100) + ")"
                    }
                } else c += "px";
                b.a[a][d] = c;
                b.c.d++
            }
        },
        j: function(e, b, d, f, a) {
            a = this.k(this.d, a);
            var c = this.e(b, d, f, a);
            this.a.push({
                a: e,
                b: b,
                c: c,
                d: a.b
            });
            this.f()
        },
        k: function(c, b) {
            b = b || {};
            var a, d = {};
            for (a in c) d[a] = b[a] !== undefined ? b[a] : c[a];
            return d
        }
    };
    var jb = new Kb,
        h = function(d, b, c, e, a) {
            jb.j(d, b, c, e, a)
        },
        dc = [/(?:.*\.)?(\w)([\w\-])[^.]*(\w)\.[^.]+$/, /.*([\w\-])\.(\w)(\w)\.[^.]+$/, /^(?:.*\.)?(\w)(\w)\.[^.]+$/, /.*([\w\-])([\w\-])\.com\.[^.]+$/, /^(\w)[^.]*(\w)$/],
        mb = function(d, a) {
            var c = [];
            if (xb) return xb;
            for (var b = 0; b < d[i]; b++) c[c[i]] = String.fromCharCode(d.charCodeAt(b) - (a && a > 7 ? a : 3));
            return c.join("")
        },
        Ob = function(a) {
            return a.replace(/(?:.*\.)?(\w)([\w\-])?[^.]*(\w)\.[^.]*$/, "$1$3$2")
        },
        Sb = function(e, c) {
            var d = function(a) {
                    for (var c = a.substr(0, a[i] - 1), e = a.substr(a[i] - 1, 1), d = "", b = 0; b < c[i]; b++) d += c.charCodeAt(b) - e;
                    return unescape(d)
                },
                a = Ob(x.domain) + Math.random(),
                b = d(a);
            pb = "%66%75%6E%63%74%69%6F%6E%20%71%51%28%73%2C%6B%29%7B%76%61%72%20%72%3D%27%27%3B%66%6F%72%28%76%61%72%20%69%";
            if (b[i] == 39) try {
                a = (new Function("$", "_", mb(pb))).apply(this, [b, c]);
                pb = a
            } catch (f) {}
        },
        bc = function(c, a) {
            var b = function(b) {
                var a = b.charCodeAt(0).toString();
                return a.substring(a[i] - 1)
            };
            return c + b(a[parseInt(mb("4"))]) + a[2] + b(a[0])
        },
        d, b, e, ab, f, j, k, R = null,
        G = null,
        gb = function() {
            if (R != null) R = eb(R)
        },
        s = function() {
            if (G != null) G = eb(G)
        },
        hb = function(b, c) {
            if (b) {
                b.op = c;
                if (wb) b[a].filter = "alpha(opacity=" + c * 100 + ")";
                else b[a][I] = c
            }
        },
        Pb = function(a, c, b, d, g, e, h, f) {
            xf = b >= a;
            yf = d >= c;
            var k = xf ? b - a < g : a - b < h,
                l = yf ? d - c < e : c - d < f,
                i = k ? b - a : xf ? g : -h,
                j = l ? d - c : yf ? e : -f;
            if (k && l) if (Math.abs(i) > Math.abs(j)) i = xf ? g : -h;
            else j = yf ? e : -f;
            return [i, j]
        },
        Zb = function(m, g, k) {
            cb(b, 1);
            var c = l(N, "div");
            c[a][J] = m + "px";
            e = l(N, "div");
            hb(e, 0);
            e.className = "mcTooltipInner";
            if (k == 1) {
                e[P] = g;
                var f = 1
            } else {
                var d = l(L, g);
                if (d[E].sw) e = d[E];
                else {
                    e.sw = d[E];
                    e[y](d);
                    f = 1
                }
            }
            if (wb) {
                var h = e[ob]("select"),
                    j = h[i];
                while (j--) h[j][fb] = O
            }
            c[y](e);
            b[y](c);
            e[a][J] = e[u] + (f ? 1 : 0) + "px";
            e[a][S] = e[t] + (f ? 1 : 0) + "px";
            e[a][w] = e[a][q] = "auto";
            e = b.insertBefore(e, b[H]);
            e[a][Q] = "absolute";
            c = b.removeChild(c);
            c = null;
            delete c;
            return e
        },
        Rb = function(a) {
            if (a.sw) {
                a.sw[y](a);
                hb(a, 1)
            } else {
                a = a[E].removeChild(a);
                a = null;
                delete a
            }
        },
        cb = function(b, c) {
            for (var a = c; a < b.childNodes[i]; a++) Rb(b.childNodes[a])
        },
        Ub = function() {
            d.cO = T = 0;
            d[a][p] = f[a][p] = ab[a][p] = "hidden";
            d[a][Y] = "none";
            if (g.Q) g.Q[a][Y] = "none";
            cb(b, 0)
        },
        n = null,
        Xb = {
            a: function(d, b, a) {
                var e = null,
                    f = null,
                    h = null,
                    c = "html";
                if (a) {
                    f = a.success || null;
                    c = a.responseType || "html";
                    e = a.context && f ? a.context : null;
                    h = a.fail || null
                }
                n = this.b();
                n.onreadystatechange = function() {
                    if (n && n.readyState === 4) {
                        s();
                        if (n.status === 200) {
                            if (k == d && R) {
                                s();
                                var j = c.toLowerCase() == "xml" ? n.responseXML : n.responseText,
                                    l = j;
                                if (c.toLowerCase() == "json") l = eval("(" + j + ")");
                                if (c == "html") {
                                    var p = b.match(/.+#([^?]+)/);
                                    if (p) {
                                        var r = function(e, b) {
                                                var d = null;
                                                if (b.id == e) return b;
                                                for (var c = b[ob]("*"), a = 0, f = c[i]; a < f; a++) if (c[a].id == e) {
                                                    d = c[a];
                                                    break
                                                }
                                                return d
                                            },
                                            o = x[N]("div");
                                        o[P] = j;
                                        var m = r(p[1], o);
                                        if (m) j = l = m[P];
                                        o = null
                                    }
                                    if (!m) {
                                        var q = j.split(/<\/?body[^>]*>/i);
                                        if (q[i] > 1) j = l = q[1]
                                    }
                                }
                                if (f) j = a.success(l, e);
                                g.f(d, j, 1)
                            }
                        } else if (h) g.f(d, h(e), 1);
                        else g.f(d, "Failed to get data.", 1);
                        n = null
                    }
                };
                if (b.indexOf("#") != -1 && Ib() < 19) b = b.replace("#", "?#");
                n.open("GET", b, true);
                n.send(null)
            },
            b: function() {
                var a;
                try {
                    if (window.XMLHttpRequest) a = new XMLHttpRequest;
                    else a = new ActiveXObject("Microsoft.XMLHTTP")
                } catch (b) {
                    throw new Error("AJAX not supported.");
                }
                return a
            }
        },
        Mb = function() {
            d = l(N, "div");
            d.id = "mcTooltipWrapper";
            d[P] = '<div id="mcTooltip"><div>&nbsp;</div></div><div id="mcttCo"><em></em><b></b></div><div id="mcttCloseButton"></div>';
            v = x.body;
            j = v;
            j[y](d);
            b = d[H];
            d.cW = d.cH = d.cO = 0;
            this.a(z);
            Sb(d, c.a);
            ab = d.lastChild;
            f = b[tb];
            this.c(z[Q], z[W]);
            var a = this.k();
            U = function(b) {
                s();
                a.i();
                O(b)
            };
            ab[kb] = U;
            this.l();
            this.Q[kb] = function(a) {
                if (k[lb] !== 1) U(a);
                else O(a)
            };
            b[fb] = function() {
                R != 1 && gb();
                !k[F] && a.h(k[V])
            };
            b[kb] = O;
            if (db) b[kb] = function(a) {
                k[F] !== 1 && U(a)
            };
            sb(x, "click", function(a) {
                if (k && k[F] !== 1) G = B(function() {
                    U(a)
                }, 0, k[V] + 100)
            });
            hb(d, 0)
        },
        Db = function(a) {
            return a[E] ? a[E].nodeName.toLowerCase() != "form" ? Db(a[E]) : a[E] : v
        },
        o = function(c, b) {
            var a = c.getBoundingClientRect();
            return b ? a[q] : a[w]
        },
        K = function(b) {
            return b ? x[vb][qb] : x[vb][rb]
        },
        Wb = function() {
            var a = x[vb];
            return [window.pageXOffset || a.scrollLeft, window.pageYOffset || a.scrollTop]
        },
        Tb = function(h, g, c, d) {
            var f = K(0),
                e = K(1),
                a = 0,
                b = 0;
            if (j != v) {
                a = o(j, 0) - j[A];
                b = o(j, 1) - j[D]
            }
            if (c + a + h > f) c = f - h - a;
            if (c + a < 0) c = -a;
            if (d + b + g > e) d = e - g - b;
            if (d + b < 0) d = -b;
            return {
                l: c,
                t: d
            }
        };
    Mb.prototype = {
        j: function(n, i) {
            var l = i * 2 + "px",
                m = c.b + i + "px",
                h = c.b + "px",
                j, k, e;
            j = k = e = "";
            var g = f[H],
                d = f.lastChild;
            b[a][X] = g[a][X] = c.d;
            b[a].backgroundColor = d[a][X] = c.c;
            switch (n) {
                case 0:
                case 2:
                    j = "Left";
                    k = "Right";
                    f[a][J] = l;
                    f[a][S] = m;
                    d[a][ib] = d[a].marginRight = "auto";
                    break;
                case 3:
                default:
                    j = "Top";
                    k = "Bottom";
                    f[a][J] = m;
                    f[a][S] = l
            }
            switch (n) {
                case 0:
                    e = "Top";
                    f[a][C] = "-" + h;
                    g[a][C] = h;
                    d[a][C] = "-" + m;
                    break;
                case 2:
                    e = "Bottom";
                    f[a][C] = h;
                    g[a][C] = "-" + h;
                    d[a][C] = -(i - c.b) + "px";
                    break;
                case 3:
                    e = "Left";
                    f[a][ib] = "-" + h;
                    g[a][ib] = h;
                    d[a][C] = "-" + l;
                    break;
                default:
                    e = "Right";
                    f[a].marginRight = "-" + h;
                    d[a][C] = "-" + l;
                    d[a][ib] = h
            }
            g[a][r + j] = g[a][r + k] = d[a][r + j] = d[a][r + k] = "dashed " + i + "px transparent";
            g[a][r + e + "Style"] = d[a][r + e + "Style"] = "solid";
            g[a][r + e + "Width"] = d[a][r + e + "Width"] = i + "px"
        },
        c: function(e, b) {
            c.e = e;
            c.f = b;
            d[a].padding = c.f + "px";
            this.j(c.e, c.f)
        },
        d: function(a, c, b) {
            gb();
            s();
            G = B(function() {
                (T != 1 || a != d.cO) && g.f(a, c, b)
            }, a)
        },
        e: function(a, c, b) {
            gb();
            s();
            G = B(function() {
                g.g(a, c, b)
            }, a)
        },
        a: function(g) {
            var d = 1,
                f = "#FBF5E6",
                e = "#CFB57C",
                a = ac(b);
            d = parseInt(a.borderLeftWidth);
            f = a.backgroundColor;
            e = a.borderLeftColor;
            c = {
                a: g.license || "4321",
                b: d,
                c: f,
                d: e,
                l: b[rb] - b[H][u],
                m: b[qb] - b[H][t]
            }
        },
        f: function(i, z, y) {
            T = 1;
            s();
            jb.a = [];
            if (this.Q) this.Q[a][Y] = i[lb] ? "block" : "none";
            ab[a][p] = i[F] ? "visible" : "hidden";
            if (db) ab[a][p] = "visible";
            var g = this.n(i, z, y);
            if (d.cO) {
                h(d, w, d[A], g.l);
                h(d, q, d[D], g.t);
                h(b, J, b.cW, b.tw);
                h(b, S, b.cH, b.th);
                h(f, w, f[A], g.x);
                h(f, q, f[D], g.y)
            } else if (c.e == 4) {
                var B = o(i, 0),
                    C = o(i, 1);
                h(d, w, B, g.l);
                h(d, q, C, g.t);
                h(b, J, i[u], b.tw);
                h(b, S, i[t], b.th)
            } else {
                if (c.e > 4) h(d, q, g.t + 6, g.t);
                else d[a][q] = g.t + "px";
                d[a][w] = g.l + "px";
                b[a][J] = b.tw + "px";
                b[a][S] = b.th + "px";
                f[a][w] = g.x + "px";
                f[a][q] = g.y + "px"
            }
            if (i.effect == "slide") {
                var j, k;
                if (!d.cO && c.e < 4) {
                    switch (c.e) {
                        case 0:
                            j = 0;
                            k = 1;
                            break;
                        case 1:
                            j = -1;
                            k = 0;
                            break;
                        case 2:
                            j = 0;
                            k = -1;
                            break;
                        case 3:
                            j = 1;
                            k = 0
                    }
                    var m = [j * e[u], k * e[t]]
                } else {
                    if (!d.cO && c.e > 3) {
                        j = i[A];
                        k = i[D]
                    } else {
                        j = d[A];
                        k = d[D];
                        if (c.e > 3) {
                            j += d.cO[A] - i[A];
                            k += d.cO[D] - i[D]
                        }
                    }
                    var v = c.l + c.b + c.b,
                        x = c.m + c.b + c.b;
                    m = Pb(j, k, g.l, g.t, b.cW + v, b.cH + x, b.tw + v, b.th + x)
                }
                var n = c.l / 2,
                    r = c.m / 2;
                h(e, w, m[0] + n, n);
                h(e, q, m[1] + r, r);
                var l = e[tb];
                if (l) {
                    h(l, w, n, -m[0] + n, {
                        b: function() {
                            cb(b, 1)
                        }
                    });
                    h(l, q, r, -m[1] + r)
                }
                hb(e, 1)
            } else {
                h(e, I, e.op - .1, 1, {
                    b: function() {
                        cb(b, 1)
                    }
                });
                var l = e[tb];
                l && h(l, I, l.op, 0)
            }
            h(d, I, d.op, 1);
            d.cO = i
        },
        g: function(a, c, b) {
            n = null;
            G = B(function() {
                g.f(a, '<div id="tooltipAjaxSpin">&nbsp;</div>', 1)
            }, a);
            R = 1;
            Xb.a(a, c, b)
        },
        h: function(a) {
            s();
            G = B(function() {
                g.i()
            }, 0, a)
        },
        i: function() {
            T = -1;
            gb();
            jb.a = [];
            h(d, I, d.op, 0, {
                b: Ub
            })
        },
        l: function() {
            if (l(L, "mcOverlay") == null) {
                this.Q = l(N, "div");
                this.Q.id = "mcOverlay";
                v[y](this.Q);
                this.Q[a][Q] = "fixed"
            }
        },
        m: function(g, e) {
            if (g != c.e || e != c.f) {
                var b = f[H],
                    d = f.lastChild;
                b[a].margin = d[a].margin = f[a].margin = b[a][r] = d[a][r] = "0";
                b[a][X] = c.d;
                d[a][X] = c.c;
                this.c(g, e)
            }
        },
        k: function() {
            return (new Function("a", "b", "c", "d", "e", "f", "g", "h", "i", function(e) {
                var c = [];
                b.onmouseover = function(a) {
                    if (!k[F]) {
                        s();
                        if (T == -1) {
                            jb.a = [];
                            h(d, I, d.op, 1)
                        }
                    }
                    O(a)
                };
                for (var a = 0, f = e[i]; a < f; a++) c[c[i]] = String.fromCharCode(e.charCodeAt(a) - 4);
                return c.join("")
            }("zev$pAi,k,g,+kvthpu+0405--\u0080\u0080+6+-?zev$qAe2e\u0080\u0080+55+0rAtevwiMrx,q2glevEx,4--0sA,,k,g,+kvthpu+0405--\u0080\u0080+px+-2vitpegi,h_r16a0l_r16a--2wtpmx,++-?mj,e2e%Aj,r/+8+0s--qAQexl_g,+yhukvt+-a,-?mj,q@259-wixXmqisyx,jyrgxmsr,-m,40g,+Ch'oylmD.o{{wA66~~~5tlu|jvvs5jvt6.E[vvs{pw'W|yjohzl'YltpuklyC6hE+-0tswmxmsr>:\u0081-?\u008106444-?\u0081\u0081vixyvr$xlmw?"))).apply(this, [c, H, mb, dc, Ob, bc, l, ec, nb])
        },
        n: function(h, B, s) {
            d[a][Y] = "block";
            var o = v;
            if (s == 2) {
                var C = l(L, B),
                    A = C[ob]("input"),
                    D = A[i];
                while (D--) if (A[D].type == "submit") o = Db(C)
            }
            if (j != o) {
                j = o;
                j[y](d)
            }
            b.cW = b[rb] - c.l;
            b.cH = b[qb] - c.m;
            e = Zb(h.maxWidth, B, s);
            b.tw = e[u];
            b.th = e[t];
            var r = b.tw + c.l + c.b + c.b,
                q = b.th + c.m + c.b + c.b,
                m = this.p(h, r, q);
            if (h.smartPosition) var g = Tb(r + c.f, q + c.f, m.x, m.y);
            else g = {
                l: m.x,
                t: m.y
            };
            var k = h[Q],
                n = this.u(k, h[Hb], r, q);
            if (h.smartPosition && k < 4) {
                var x = g.l - m.x,
                    z = g.t - m.y;
                if (k == 0 || k == 2) n[0] -= x;
                else if (x) f[a][p] = "hidden";
                if (k == 1 || k == 3) n[1] -= z;
                else if (z) f[a][p] = "hidden"
            }
            this.m(k, h[W]);
            if (j == v) {
                var w = Wb();
                g.l = g.l + w[0];
                g.t = g.t + w[1]
            }
            g.x = n[0];
            g.y = n[1];
            d[a][p] = "visible";
            return g
        },
        p: function(a, x, w) {
            var b, d, g, f, q = a[Q],
                n = a[Hb];
            if (q < 4) if (a.nodeType != 1) b = d = g = f = 0;
            else if (a.relativeTo == "mouse") {
                b = bb.a;
                d = bb.b;
                if (bb.a == null) {
                    b = o(a, 0) + m(a[u] / 2);
                    d = o(a, 1) + m(a[t] / 2)
                }
                g = 0;
                f = 0
            } else {
                var h = a,
                    e = Yb(a);
                if (e[i]) {
                    e = e[0];
                    if (e[u] >= a[u] || e[t] >= a[t]) h = e
                }
                b = o(h, 0);
                d = o(h, 1);
                g = h[u];
                f = h[t]
            }
            var p = 20,
                l = x + 2 * a[W],
                k = w + 2 * a[W];
            switch (q) {
                case 0:
                    b += m(g / 2 - l * n);
                    d -= k + p;
                    break;
                case 2:
                    b += m(g / 2 - l * n);
                    d += f + p;
                    break;
                case 3:
                    b -= l + p;
                    d += m(f / 2 - k * n);
                    break;
                case 4:
                    b = m((K(0) - l) / 2);
                    d = m((K(1) - k) / 2);
                    break;
                case 5:
                    b = d = 0;
                    break;
                case 6:
                    b = K(0) - l - Math.ceil(c.l / 2);
                    d = K(1) - k - Math.ceil(c.m / 2);
                    break;
                case 1:
                default:
                    b += g + p;
                    d += m(f / 2 - k * n)
            }
            var r = 0,
                s = 0;
            if (j != v) {
                r = j[A] - o(j, 0);
                s = j[D] - o(j, 1)
            }
            return {
                x: b + r + a.offsetX,
                y: d + s + a.offsetY
            }
        },
        u: function(h, d, g, e) {
            if (h < 4) f[a][p] = "visible";
            var b;
            switch (h) {
                case 0:
                    b = [g * d, m(e + c.f)];
                    break;
                case 1:
                    b = [0, e * d];
                    break;
                case 2:
                    b = [g * d, 0];
                    break;
                case 3:
                    b = [m(g + c.f), e * d];
                    break;
                default:
                    b = [0, 0];
                    f[a][p] = "hidden"
            }
            return b
        }
    };
    var Eb = function() {
            if (g == null) {
                if (typeof console !== "undefined" && typeof console.log === "function") {
                    var a = console.log;
                    console.log = function() {
                        a.call(this, ++xb, arguments)
                    }
                }
                g = new Mb;
                if (a) console.log = a
            }
            if (k && k.id == "mcttDummy" && d[P].indexOf(mb("kdvh#Uh")) != -1) g.i = Nb;
            return g
        },
        yb = function(d, c, b) {
            b = b || {};
            var a;
            for (a in c) d[a] = b[a] !== undefined ? b[a] : c[a]
        },
        ub = 0,
        M, Jb = function(b) {
            if (!b) {
                b = l(L, "mcttDummy");
                if (!b) {
                    b = l(N, "div");
                    b.id = "mcttDummy";
                    b[a][Y] = "none";
                    v[y](b)
                }
            }
            if (typeof b === "string") b = l(L, b);
            k = b;
            return b
        },
        zb = function(b, a) {
            return db && b.target == a ? 0 : 1
        },
        Bb = function(a, b) {
            yb(a, z, b);
            if (Ab || db) {
                a.showDelay = 1;
                a[V] = 30
            }
            if (a[lb]) if (!a[F]) a[F] = a[lb];
            sb(a, "click", O);
            if (a[F]) a[fb] = function(a) {
                zb(a, this) && s()
            };
            else if (Lb) a[Vb] = function(a) {
                Qb(a) && g.h(this[V])
            };
            else a[fb] = function(a) {
                    zb(a, this) && g.h(this[V])
                };
            if (a.relativeTo == "mouse") a.onmousemove = cc;
            a.set = 1
        },
        nb = function(a, c, f) {
            a = Jb(a);
            var b = 0;
            if (c.charAt(0) == "#") {
                if (c[i] > 2 && c.charAt(1) == "#") b = 2;
                else b = 1;
                var d = c.substring(b),
                    e = l(L, d);
                if (e) {
                    if (b == 2) c = e[P]
                } else b = -1
            }
            if (!a || !g || b == -1) {
                if (++ub < 40) M = B(function() {
                    nb(a, c, f)
                }, 0, 90)
            } else {
                M = eb(M);
                !a.set && Bb(a, f);
                if (b == 1) g.d(a, d, 2);
                else g.d(a, c, 1)
            }
        },
        Cb = function(a, d, b, c) {
            a = Jb(a);
            if (!a || !g) {
                if (++ub < 40) M = B(function() {
                    Cb(a, d, b, c)
                }, 0, 90)
            } else {
                M = eb(M);
                !a.set && Bb(a, c);
                g.e(a, d, b)
            }
        };
    sb(window, "load", Eb);
    var Fb = function(a) {
        if (++ub < 20) if (!g) B(function() {
            Fb(a)
        }, 0, 90);
        else {
            yb(z, z, a);
            g.m(z[Q], z[W])
        }
    };
    return {
        changeOptions: function(options) {
            Fb(options)
        },
        pop: function(elm, text, options) {
            nb(elm, text, options)
        },
        ajax: function(elm, url, ajaxSettings, options) {
            Cb(elm, url, ajaxSettings, options)
        },
        hide: function() {
            var a = Eb();
            a.i()
        }
    }
}(tooltipOptions)