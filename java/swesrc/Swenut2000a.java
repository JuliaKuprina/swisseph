#ifdef J2ME
#define JAVAME
#endif /* J2ME */

/*
   This is a port of the Swiss Ephemeris Free Edition, Version 2.00.00
   of Astrodienst AG, Switzerland from the original C Code to Java. For
   copyright see the original copyright notices below and additional
   copyright notes in the file named LICENSE, or - if this file is not
   available - the copyright notes at http://www.astro.ch/swisseph/ and
   following.

   For any questions or comments regarding this port to Java, you should
   ONLY contact me and not Astrodienst, as the Astrodienst AG is not involved
   in this port in any way.

   Thomas Mack, mack@ifis.cs.tu-bs.de, 28rd of April 2006

*/
/* Copyright (C) 1997, 1998 Astrodienst AG, Switzerland.  All rights reserved.
  
  This file is part of Swiss Ephemeris Free Edition.
  
  Swiss Ephemeris is distributed with NO WARRANTY OF ANY KIND.  No author
  or distributor accepts any responsibility for the consequences of using it,
  or for whether it serves any particular purpose or works at all, unless he
  or she says so in writing.  Refer to the Swiss Ephemeris Public License
  ("SEPL" or the "License") for full details.
  
  Every copy of Swiss Ephemeris must include a copy of the License,
  normally in a plain ASCII text file named LICENSE.  The License grants you
  the right to copy, modify and redistribute Swiss Ephemeris, but only
  under certain conditions described in the License.  Among other things, the
  License requires that the copyright notices and this notice be preserved on
  all copies.

  For uses of the Swiss Ephemeris which do not fall under the definitions
  laid down in the Public License, the Swiss Ephemeris Professional Edition
  must be purchased by the developer before he/she distributes any of his
  software or makes available any product or service built upon the use of
  the Swiss Ephemeris.

  Authors of the Swiss Ephemeris: Dieter Koch and Alois Treindl

  The authors of Swiss Ephemeris have no control or influence over any of
  the derived works, i.e. over software or services created by other
  programmers which use Swiss Ephemeris functions.

  The names of the authors or of the copyright holder (Astrodienst) must not
  be used for promoting any software, product or service which uses or contains
  the Swiss Ephemeris. This copyright notice is the ONLY place where the
  names of the authors can legally appear, except in cases where they have
  given special permission in writing.

  The trademarks 'Swiss Ephemeris' and 'Swiss Ephemeris inside' may be used
  for promoting such software, products or services.
*/
package swisseph;

public class Swenut2000a
#ifndef JAVAME
		implements java.io.Serializable
#endif /* JAVAME */
		{
  /* 0.1 microarcsecond to degrees */
  static final double O1MAS2DEG = 1 / 3600.0 / 10000000.0;
  /* Number of terms in the luni-solar nutation model */
  static final int NLS = 678;
  static final int NLS_2000B = 77;
  /* Number of terms in the planetary nutation model */
  static final int NPL = 687;

  /* Luni-Solar nutation coefficients, unit 1e-7 arcsec
   * longitude (sin, t*sin, cos), obliquity (cos, t*cos, sin) */
  // see Swenut2000a_cls!

//ifdef NUT_IAU_2000A // oh well, I changed it to not be a define but rather a constant
  /* Planetary argument multipliers
   * L L' F D Om Me Ve E Ma Ju Sa Ur Ne pre */
  // see Swenut2000a_npl!

  /* Planetary nutation coefficients, unit 1e-7 arcsec
   * longitude (sin, cos), obliquity (sin, cos) */
  static final int icpl[] = {
  1440, 0, 0, 0,
  56, -117, -42, -40,
  125, -43, 0, -54,
  0, 5, 0, 0,
  3, -7, -3, 0,
  3, 0, 0, -2,
  -114, 0, 0, 61,
  -219, 89, 0, 0,
  -3, 0, 0, 0,
  -462, 1604, 0, 0,
  99, 0, 0, -53,
  -3, 0, 0, 2,
  0, 6, 2, 0,
  3, 0, 0, 0,
  -12, 0, 0, 0,
  14, -218, 117, 8,
  31, -481, -257, -17,
  -491, 128, 0, 0,
  -3084, 5123, 2735, 1647,
  -1444, 2409, -1286, -771,
  11, -24, -11, -9,
  26, -9, 0, 0,
  103, -60, 0, 0,
  0, -13, -7, 0,
  -26, -29, -16, 14,
  9, -27, -14, -5,
  12, 0, 0, -6,
  -7, 0, 0, 0,
  0, 24, 0, 0,
  284, 0, 0, -151,
  226, 101, 0, 0,
  0, -8, -2, 0,
  0, -6, -3, 0,
  5, 0, 0, -3,
  -41, 175, 76, 17,
  0, 15, 6, 0,
  425, 212, -133, 269,
  1200, 598, 319, -641,
  235, 334, 0, 0,
  11, -12, -7, -6,
  5, -6, 3, 3,
  -5, 0, 0, 3,
  6, 0, 0, -3,
  15, 0, 0, 0,
  13, 0, 0, -7,
  -6, -9, 0, 0,
  266, -78, 0, 0,
  -460, -435, -232, 246,
  0, 15, 7, 0,
  -3, 0, 0, 2,
  0, 131, 0, 0,
  4, 0, 0, 0,
  0, 3, 0, 0,
  0, 4, 2, 0,
  0, 3, 0, 0,
  -17, -19, -10, 9,
  -9, -11, 6, -5,
  -6, 0, 0, 3,
  -16, 8, 0, 0,
  0, 3, 0, 0,
  11, 24, 11, -5,
  -3, -4, -2, 1,
  3, 0, 0, -1,
  0, -8, -4, 0,
  0, 3, 0, 0,
  0, 5, 0, 0,
  0, 3, 2, 0,
  -6, 4, 2, 3,
  -3, -5, 0, 0,
  -5, 0, 0, 2,
  4, 24, 13, -2,
  -42, 20, 0, 0,
  -10, 233, 0, 0,
  -3, 0, 0, 1,
  78, -18, 0, 0,
  0, 3, 1, 0,
  0, -3, -1, 0,
  0, -4, -2, 1,
  0, -8, -4, -1,
  0, -5, 3, 0,
  -7, 0, 0, 3,
  -14, 8, 3, 6,
  0, 8, -4, 0,
  0, 19, 10, 0,
  45, -22, 0, 0,
  -3, 0, 0, 0,
  0, -3, 0, 0,
  0, 3, 0, 0,
  3, 5, 3, -2,
  89, -16, -9, -48,
  0, 3, 0, 0,
  -3, 7, 4, 2,
  -349, -62, 0, 0,
  -15, 22, 0, 0,
  -3, 0, 0, 0,
  -53, 0, 0, 0,
  5, 0, 0, -3,
  0, -8, 0, 0,
  15, -7, -4, -8,
  -3, 0, 0, 1,
  -21, -78, 0, 0,
  20, -70, -37, -11,
  0, 6, 3, 0,
  5, 3, 2, -2,
  -17, -4, -2, 9,
  0, 6, 3, 0,
  32, 15, -8, 17,
  174, 84, 45, -93,
  11, 56, 0, 0,
  -66, -12, -6, 35,
  47, 8, 4, -25,
  0, 8, 4, 0,
  10, -22, -12, -5,
  -3, 0, 0, 2,
  -24, 12, 0, 0,
  5, -6, 0, 0,
  3, 0, 0, -2,
  4, 3, 1, -2,
  0, 29, 15, 0,
  -5, -4, -2, 2,
  8, -3, -1, -5,
  0, -3, 0, 0,
  10, 0, 0, 0,
  3, 0, 0, -2,
  -5, 0, 0, 3,
  46, 66, 35, -25,
  -14, 7, 0, 0,
  0, 3, 2, 0,
  -5, 0, 0, 0,
  -68, -34, -18, 36,
  0, 14, 7, 0,
  10, -6, -3, -5,
  -5, -4, -2, 3,
  -3, 5, 2, 1,
  76, 17, 9, -41,
  84, 298, 159, -45,
  3, 0, 0, -1,
  -3, 0, 0, 2,
  -3, 0, 0, 1,
  -82, 292, 156, 44,
  -73, 17, 9, 39,
  -9, -16, 0, 0,
  3, 0, -1, -2,
  -3, 0, 0, 0,
  -9, -5, -3, 5,
  -439, 0, 0, 0,
  57, -28, -15, -30,
  0, -6, -3, 0,
  -4, 0, 0, 2,
  -40, 57, 30, 21,
  23, 7, 3, -13,
  273, 80, 43, -146,
  -449, 430, 0, 0,
  -8, -47, -25, 4,
  6, 47, 25, -3,
  0, 23, 13, 0,
  -3, 0, 0, 2,
  3, -4, -2, -2,
  -48, -110, -59, 26,
  51, 114, 61, -27,
  -133, 0, 0, 57,
  0, 4, 0, 0,
  -21, -6, -3, 11,
  0, -3, -1, 0,
  -11, -21, -11, 6,
  -18, -436, -233, 9,
  35, -7, 0, 0,
  0, 5, 3, 0,
  11, -3, -1, -6,
  -5, -3, -1, 3,
  -53, -9, -5, 28,
  0, 3, 2, 1,
  4, 0, 0, -2,
  0, -4, 0, 0,
  -50, 194, 103, 27,
  -13, 52, 28, 7,
  -91, 248, 0, 0,
  6, 49, 26, -3,
  -6, -47, -25, 3,
  0, 5, 3, 0,
  52, 23, 10, -23,
  -3, 0, 0, 1,
  0, 5, 3, 0,
  -4, 0, 0, 0,
  -4, 8, 3, 2,
  10, 0, 0, 0,
  3, 0, 0, -2,
  0, 8, 4, 0,
  0, 8, 4, 1,
  -4, 0, 0, 0,
  -4, 0, 0, 0,
  -8, 4, 2, 4,
  8, -4, -2, -4,
  0, 15, 7, 0,
  -138, 0, 0, 0,
  0, -7, -3, 0,
  0, -7, -3, 0,
  54, 0, 0, -29,
  0, 10, 4, 0,
  -7, 0, 0, 3,
  -37, 35, 19, 20,
  0, 4, 0, 0,
  -4, 9, 0, 0,
  8, 0, 0, -4,
  -9, -14, -8, 5,
  -3, -9, -5, 3,
  -145, 47, 0, 0,
  -10, 40, 21, 5,
  11, -49, -26, -7,
  -2150, 0, 0, 932,
  -12, 0, 0, 5,
  85, 0, 0, -37,
  4, 0, 0, -2,
  3, 0, 0, -2,
  -86, 153, 0, 0,
  -6, 9, 5, 3,
  9, -13, -7, -5,
  -8, 12, 6, 4,
  -51, 0, 0, 22,
  -11, -268, -116, 5,
  0, 12, 5, 0,
  0, 7, 3, 0,
  31, 6, 3, -17,
  140, 27, 14, -75,
  57, 11, 6, -30,
  -14, -39, 0, 0,
  0, -6, -2, 0,
  4, 15, 8, -2,
  0, 4, 0, 0,
  -3, 0, 0, 1,
  0, 11, 5, 0,
  9, 6, 0, 0,
  -4, 10, 4, 2,
  5, 3, 0, 0,
  16, 0, 0, -9,
  -3, 0, 0, 0,
  0, 3, 2, -1,
  7, 0, 0, -3,
  -25, 22, 0, 0,
  42, 223, 119, -22,
  -27, -143, -77, 14,
  9, 49, 26, -5,
  -1166, 0, 0, 505,
  -5, 0, 0, 2,
  -6, 0, 0, 3,
  -8, 0, 1, 4,
  0, -4, 0, 0,
  117, 0, 0, -63,
  -4, 8, 4, 2,
  3, 0, 0, -2,
  -5, 0, 0, 2,
  0, 31, 0, 0,
  -5, 0, 1, 3,
  4, 0, 0, -2,
  -4, 0, 0, 2,
  -24, -13, -6, 10,
  3, 0, 0, 0,
  0, -32, -17, 0,
  8, 12, 5, -3,
  3, 0, 0, -1,
  7, 13, 0, 0,
  -3, 16, 0, 0,
  50, 0, 0, -27,
  0, -5, -3, 0,
  13, 0, 0, 0,
  0, 5, 3, 1,
  24, 5, 2, -11,
  5, -11, -5, -2,
  30, -3, -2, -16,
  18, 0, 0, -9,
  8, 614, 0, 0,
  3, -3, -1, -2,
  6, 17, 9, -3,
  -3, -9, -5, 2,
  0, 6, 3, -1,
  -127, 21, 9, 55,
  3, 5, 0, 0,
  -6, -10, -4, 3,
  5, 0, 0, 0,
  16, 9, 4, -7,
  3, 0, 0, -2,
  0, 22, 0, 0,
  0, 19, 10, 0,
  7, 0, 0, -4,
  0, -5, -2, 0,
  0, 3, 1, 0,
  -9, 3, 1, 4,
  17, 0, 0, -7,
  0, -3, -2, -1,
  -20, 34, 0, 0,
  -10, 0, 1, 5,
  -4, 0, 0, 2,
  22, -87, 0, 0,
  -4, 0, 0, 2,
  -3, -6, -2, 1,
  -16, -3, -1, 7,
  0, -3, -2, 0,
  4, 0, 0, 0,
  -68, 39, 0, 0,
  27, 0, 0, -14,
  0, -4, 0, 0,
  -25, 0, 0, 0,
  -12, -3, -2, 6,
  3, 0, 0, -1,
  3, 66, 29, -1,
  490, 0, 0, -213,
  -22, 93, 49, 12,
  -7, 28, 15, 4,
  -3, 13, 7, 2,
  -46, 14, 0, 0,
  -5, 0, 0, 0,
  2, 1, 0, 0,
  0, -3, 0, 0,
  -28, 0, 0, 15,
  5, 0, 0, -2,
  0, 3, 0, 0,
  -11, 0, 0, 5,
  0, 3, 1, 0,
  -3, 0, 0, 1,
  25, 106, 57, -13,
  5, 21, 11, -3,
  1485, 0, 0, 0,
  -7, -32, -17, 4,
  0, 5, 3, 0,
  -6, -3, -2, 3,
  30, -6, -2, -13,
  -4, 4, 0, 0,
  -19, 0, 0, 10,
  0, 4, 2, -1,
  0, 3, 0, 0,
  4, 0, 0, -2,
  0, -3, -1, 0,
  -3, 0, 0, 0,
  5, 3, 1, -2,
  0, 11, 0, 0,
  118, 0, 0, -52,
  0, -5, -3, 0,
  -28, 36, 0, 0,
  5, -5, 0, 0,
  14, -59, -31, -8,
  0, 9, 5, 1,
  -458, 0, 0, 198,
  0, -45, -20, 0,
  9, 0, 0, -5,
  0, -3, 0, 0,
  0, -4, -2, -1,
  11, 0, 0, -6,
  6, 0, 0, -2,
  -16, 23, 0, 0,
  0, -4, -2, 0,
  -5, 0, 0, 2,
  -166, 269, 0, 0,
  15, 0, 0, -8,
  10, 0, 0, -4,
  -78, 45, 0, 0,
  0, -5, -2, 0,
  7, 0, 0, -4,
  -5, 328, 0, 0,
  3, 0, 0, -2,
  5, 0, 0, -2,
  0, 3, 1, 0,
  -3, 0, 0, 0,
  -3, 0, 0, 0,
  0, -4, -2, 0,
  -1223, -26, 0, 0,
  0, 7, 3, 0,
  3, 0, 0, 0,
  0, 3, 2, 0,
  -6, 20, 0, 0,
  -368, 0, 0, 0,
  -75, 0, 0, 0,
  11, 0, 0, -6,
  3, 0, 0, -2,
  -3, 0, 0, 1,
  -13, -30, 0, 0,
  21, 3, 0, 0,
  -3, 0, 0, 1,
  -4, 0, 0, 2,
  8, -27, 0, 0,
  -19, -11, 0, 0,
  -4, 0, 0, 2,
  0, 5, 2, 0,
  -6, 0, 0, 2,
  -8, 0, 0, 0,
  -1, 0, 0, 0,
  -14, 0, 0, 6,
  6, 0, 0, 0,
  -74, 0, 0, 32,
  0, -3, -1, 0,
  4, 0, 0, -2,
  8, 11, 0, 0,
  0, 3, 2, 0,
  -262, 0, 0, 114,
  0, -4, 0, 0,
  -7, 0, 0, 4,
  0, -27, -12, 0,
  -19, -8, -4, 8,
  202, 0, 0, -87,
  -8, 35, 19, 5,
  0, 4, 2, 0,
  16, -5, 0, 0,
  5, 0, 0, -3,
  0, -3, 0, 0,
  1, 0, 0, 0,
  -35, -48, -21, 15,
  -3, -5, -2, 1,
  6, 0, 0, -3,
  3, 0, 0, -1,
  0, -5, 0, 0,
  12, 55, 29, -6,
  0, 5, 3, 0,
  -598, 0, 0, 0,
  -3, -13, -7, 1,
  -5, -7, -3, 2,
  3, 0, 0, -1,
  5, -7, 0, 0,
  4, 0, 0, -2,
  16, -6, 0, 0,
  8, -3, 0, 0,
  8, -31, -16, -4,
  0, 3, 1, 0,
  113, 0, 0, -49,
  0, -24, -10, 0,
  4, 0, 0, -2,
  27, 0, 0, 0,
  -3, 0, 0, 1,
  0, -4, -2, 0,
  5, 0, 0, -2,
  0, -3, 0, 0,
  -13, 0, 0, 6,
  5, 0, 0, -2,
  -18, -10, -4, 8,
  -4, -28, 0, 0,
  -5, 6, 3, 2,
  -3, 0, 0, 1,
  -5, -9, -4, 2,
  17, 0, 0, -7,
  11, 4, 0, 0,
  0, -6, -2, 0,
  83, 15, 0, 0,
  -4, 0, 0, 2,
  0, -114, -49, 0,
  117, 0, 0, -51,
  -5, 19, 10, 2,
  -3, 0, 0, 0,
  -3, 0, 0, 2,
  0, -3, -1, 0,
  3, 0, 0, 0,
  0, -6, -2, 0,
  393, 3, 0, 0,
  -4, 21, 11, 2,
  -6, 0, -1, 3,
  -3, 8, 4, 1,
  8, 0, 0, 0,
  18, -29, -13, -8,
  8, 34, 18, -4,
  89, 0, 0, 0,
  3, 12, 6, -1,
  54, -15, -7, -24,
  0, 3, 0, 0,
  3, 0, 0, -1,
  0, 35, 0, 0,
  -154, -30, -13, 67,
  15, 0, 0, 0,
  0, 4, 2, 0,
  0, 9, 0, 0,
  80, -71, -31, -35,
  0, -20, -9, 0,
  11, 5, 2, -5,
  61, -96, -42, -27,
  14, 9, 4, -6,
  -11, -6, -3, 5,
  0, -3, -1, 0,
  123, -415, -180, -53,
  0, 0, 0, -35,
  -5, 0, 0, 0,
  7, -32, -17, -4,
  0, -9, -5, 0,
  0, -4, 2, 0,
  -89, 0, 0, 38,
  0, -86, -19, -6,
  0, 0, -19, 6,
  -123, -416, -180, 53,
  0, -3, -1, 0,
  12, -6, -3, -5,
  -13, 9, 4, 6,
  0, -15, -7, 0,
  3, 0, 0, -1,
  -62, -97, -42, 27,
  -11, 5, 2, 5,
  0, -19, -8, 0,
  -3, 0, 0, 1,
  0, 4, 2, 0,
  0, 3, 0, 0,
  0, 4, 2, 0,
  -85, -70, -31, 37,
  163, -12, -5, -72,
  -63, -16, -7, 28,
  -21, -32, -14, 9,
  0, -3, -1, 0,
  3, 0, 0, -2,
  0, 8, 0, 0,
  3, 10, 4, -1,
  3, 0, 0, -1,
  0, -7, -3, 0,
  0, -4, -2, 0,
  6, 19, 0, 0,
  5, -173, -75, -2,
  0, -7, -3, 0,
  7, -12, -5, -3,
  -3, 0, 0, 2,
  3, -4, -2, -1,
  74, 0, 0, -32,
  -3, 12, 6, 2,
  26, -14, -6, -11,
  19, 0, 0, -8,
  6, 24, 13, -3,
  83, 0, 0, 0,
  0, -10, -5, 0,
  11, -3, -1, -5,
  3, 0, 1, -1,
  3, 0, 0, -1,
  -4, 0, 0, 0,
  5, -23, -12, -3,
  -339, 0, 0, 147,
  0, -10, -5, 0,
  5, 0, 0, 0,
  3, 0, 0, -1,
  0, -4, -2, 0,
  18, -3, 0, 0,
  9, -11, -5, -4,
  -8, 0, 0, 4,
  3, 0, 0, -1,
  0, 9, 0, 0,
  6, -9, -4, -2,
  -4, -12, 0, 0,
  67, -91, -39, -29,
  30, -18, -8, -13,
  0, 0, 0, 0,
  0, -114, -50, 0,
  0, 0, 0, 23,
  517, 16, 7, -224,
  0, -7, -3, 0,
  143, -3, -1, -62,
  29, 0, 0, -13,
  -4, 0, 0, 2,
  -6, 0, 0, 3,
  5, 12, 5, -2,
  -25, 0, 0, 11,
  -3, 0, 0, 1,
  0, 4, 2, 0,
  -22, 12, 5, 10,
  50, 0, 0, -22,
  0, 7, 4, 0,
  0, 3, 1, 0,
  -4, 4, 2, 2,
  -5, -11, -5, 2,
  0, 4, 2, 0,
  4, 17, 9, -2,
  59, 0, 0, 0,
  0, -4, -2, 0,
  -8, 0, 0, 4,
  -3, 0, 0, 0,
  4, -15, -8, -2,
  370, -8, 0, -160,
  0, 0, -3, 0,
  0, 3, 1, 0,
  -6, 3, 1, 3,
  0, 6, 0, 0,
  -10, 0, 0, 4,
  0, 9, 4, 0,
  4, 17, 7, -2,
  34, 0, 0, -15,
  0, 5, 3, 0,
  -5, 0, 0, 2,
  -37, -7, -3, 16,
  3, 13, 7, -2,
  40, 0, 0, 0,
  0, -3, -2, 0,
  -184, -3, -1, 80,
  -3, 0, 0, 1,
  -3, 0, 0, 0,
  0, -10, -6, -1,
  31, -6, 0, -13,
  -3, -32, -14, 1,
  -7, 0, 0, 3,
  0, -8, -4, 0,
  3, -4, 0, 0,
  0, 4, 0, 0,
  0, 3, 1, 0,
  19, -23, -10, 2,
  0, 0, 0, -10,
  0, 3, 2, 0,
  0, 9, 5, -1,
  28, 0, 0, 0,
  0, -7, -4, 0,
  8, -4, 0, -4,
  0, 0, -2, 0,
  0, 3, 0, 0,
  -3, 0, 0, 1,
  -9, 0, 1, 4,
  3, 12, 5, -1,
  17, -3, -1, 0,
  0, 7, 4, 0,
  19, 0, 0, 0,
  0, -5, -3, 0,
  14, -3, 0, -1,
  0, 0, -1, 0,
  0, 0, 0, -5,
  0, 5, 3, 0,
  13, 0, 0, 0,
  0, -3, -2, 0,
  2, 9, 4, 3,
  0, 0, 0, -4,
  8, 0, 0, 0,
  0, 4, 2, 0,
  6, 0, 0, -3,
  6, 0, 0, 0,
  0, 3, 1, 0,
  5, 0, 0, -2,
  3, 0, 0, -1,
  -3, 0, 0, 0,
  6, 0, 0, 0,
  7, 0, 0, 0,
  -4, 0, 0, 0,
  4, 0, 0, 0,
  6, 0, 0, 0,
  0, -4, 0, 0,
  0, -4, 0, 0,
  5, 0, 0, 0,
  -3, 0, 0, 0,
  4, 0, 0, 0,
  -5, 0, 0, 0,
  4, 0, 0, 0,
  0, 3, 0, 0,
  13, 0, 0, 0,
  21, 11, 0, 0,
  0, -5, 0, 0,
  0, -5, -2, 0,
  0, 5, 3, 0,
  0, -5, 0, 0,
  -3, 0, 0, 2,
  20, 10, 0, 0,
  -34, 0, 0, 0,
  -19, 0, 0, 0,
  3, 0, 0, -2,
  -3, 0, 0, 1,
  -6, 0, 0, 3,
  -4, 0, 0, 0,
  3, 0, 0, 0,
  3, 0, 0, 0,
  4, 0, 0, 0,
  3, 0, 0, -1,
  6, 0, 0, -3,
  -8, 0, 0, 3,
  0, 3, 1, 0,
  -3, 0, 0, 0,
  0, -3, -2, 0,
  126, -63, -27, -55,
  -5, 0, 1, 2,
  -3, 28, 15, 2,
  5, 0, 1, -2,
  0, 9, 4, 1,
  0, 9, 4, -1,
  -126, -63, -27, 55,
  3, 0, 0, -1,
  21, -11, -6, -11,
  0, -4, 0, 0,
  -21, -11, -6, 11,
  -3, 0, 0, 1,
  0, 3, 1, 0,
  8, 0, 0, -4,
  -6, 0, 0, 3,
  -3, 0, 0, 1,
  3, 0, 0, -1,
  -3, 0, 0, 1,
  -5, 0, 0, 2,
  24, -12, -5, -11,
  0, 3, 1, 0,
  0, 3, 1, 0,
  0, 3, 2, 0,
  -24, -12, -5, 10,
  4, 0, -1, -2,
  13, 0, 0, -6,
  7, 0, 0, -3,
  3, 0, 0, -1,
  3, 0, 0, -1,
  };
//endif /* NUT_IAU_2000A */	// See above...

}
