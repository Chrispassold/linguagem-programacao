
package PROVA3;

public class Questao1 {

    private static int multiplosSete = 0;
    private static int impares = 0;

    public static void main(String[] args){
        multiplosSete();
        impares();
    }

    private static void multiplosSete(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (multiplosSete != 1000){
                    if((multiplosSete % 7) == 0)
                        System.out.println("Thread multiplos: " + multiplosSete);

                    multiplosSete++;
                }
            }
        }).start();
    }

    private static void impares(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (impares != 300){
                    if((impares % 2) != 0)
                        System.out.println("Thread impares: " + impares);

                    impares++;
                }
            }
        }).start();
    }

}





/*
Thread multiplos: 0
Thread impares: 1
Thread multiplos: 7
Thread impares: 3
Thread multiplos: 14
Thread impares: 5
Thread multiplos: 21
Thread impares: 7
Thread multiplos: 28
Thread multiplos: 35
Thread multiplos: 42
Thread multiplos: 49
Thread impares: 9
Thread multiplos: 56
Thread impares: 11
Thread impares: 13
Thread impares: 15
Thread impares: 17
Thread impares: 19
Thread impares: 21
Thread impares: 23
Thread multiplos: 63
Thread impares: 25
Thread multiplos: 70
Thread impares: 27
Thread multiplos: 77
Thread impares: 29
Thread multiplos: 84
Thread impares: 31
Thread multiplos: 91
Thread impares: 33
Thread multiplos: 98
Thread impares: 35
Thread multiplos: 105
Thread impares: 37
Thread multiplos: 112
Thread impares: 39
Thread multiplos: 119
Thread impares: 41
Thread multiplos: 126
Thread impares: 43
Thread multiplos: 133
Thread impares: 45
Thread multiplos: 140
Thread impares: 47
Thread multiplos: 147
Thread impares: 49
Thread multiplos: 154
Thread impares: 51
Thread multiplos: 161
Thread impares: 53
Thread multiplos: 168
Thread impares: 55
Thread multiplos: 175
Thread impares: 57
Thread multiplos: 182
Thread impares: 59
Thread multiplos: 189
Thread impares: 61
Thread multiplos: 196
Thread impares: 63
Thread multiplos: 203
Thread impares: 65
Thread multiplos: 210
Thread impares: 67
Thread multiplos: 217
Thread impares: 69
Thread multiplos: 224
Thread impares: 71
Thread multiplos: 231
Thread impares: 73
Thread multiplos: 238
Thread impares: 75
Thread multiplos: 245
Thread impares: 77
Thread multiplos: 252
Thread impares: 79
Thread multiplos: 259
Thread impares: 81
Thread multiplos: 266
Thread impares: 83
Thread multiplos: 273
Thread impares: 85
Thread multiplos: 280
Thread impares: 87
Thread multiplos: 287
Thread impares: 89
Thread multiplos: 294
Thread impares: 91
Thread multiplos: 301
Thread impares: 93
Thread multiplos: 308
Thread impares: 95
Thread multiplos: 315
Thread impares: 97
Thread multiplos: 322
Thread impares: 99
Thread multiplos: 329
Thread impares: 101
Thread multiplos: 336
Thread impares: 103
Thread multiplos: 343
Thread impares: 105
Thread multiplos: 350
Thread impares: 107
Thread multiplos: 357
Thread impares: 109
Thread multiplos: 364
Thread impares: 111
Thread impares: 113
Thread multiplos: 371
Thread impares: 115
Thread multiplos: 378
Thread impares: 117
Thread impares: 119
Thread impares: 121
Thread multiplos: 385
Thread multiplos: 392
Thread impares: 123
Thread multiplos: 399
Thread impares: 125
Thread impares: 127
Thread impares: 129
Thread multiplos: 406
Thread multiplos: 413
Thread multiplos: 420
Thread multiplos: 427
Thread multiplos: 434
Thread multiplos: 441
Thread multiplos: 448
Thread multiplos: 455
Thread multiplos: 462
Thread multiplos: 469
Thread multiplos: 476
Thread multiplos: 483
Thread multiplos: 490
Thread multiplos: 497
Thread multiplos: 504
Thread multiplos: 511
Thread multiplos: 518
Thread multiplos: 525
Thread multiplos: 532
Thread multiplos: 539
Thread multiplos: 546
Thread impares: 131
Thread multiplos: 553
Thread impares: 133
Thread multiplos: 560
Thread impares: 135
Thread multiplos: 567
Thread impares: 137
Thread multiplos: 574
Thread impares: 139
Thread multiplos: 581
Thread impares: 141
Thread multiplos: 588
Thread impares: 143
Thread multiplos: 595
Thread impares: 145
Thread multiplos: 602
Thread impares: 147
Thread multiplos: 609
Thread impares: 149
Thread multiplos: 616
Thread impares: 151
Thread multiplos: 623
Thread impares: 153
Thread multiplos: 630
Thread impares: 155
Thread multiplos: 637
Thread impares: 157
Thread multiplos: 644
Thread impares: 159
Thread multiplos: 651
Thread impares: 161
Thread multiplos: 658
Thread impares: 163
Thread multiplos: 665
Thread impares: 165
Thread multiplos: 672
Thread impares: 167
Thread impares: 169
Thread multiplos: 679
Thread impares: 171
Thread multiplos: 686
Thread impares: 173
Thread multiplos: 693
Thread impares: 175
Thread multiplos: 700
Thread impares: 177
Thread multiplos: 707
Thread impares: 179
Thread multiplos: 714
Thread impares: 181
Thread multiplos: 721
Thread impares: 183
Thread multiplos: 728
Thread impares: 185
Thread impares: 187
Thread impares: 189
Thread impares: 191
Thread impares: 193
Thread impares: 195
Thread impares: 197
Thread impares: 199
Thread impares: 201
Thread impares: 203
Thread impares: 205
Thread impares: 207
Thread impares: 209
Thread impares: 211
Thread impares: 213
Thread impares: 215
Thread impares: 217
Thread impares: 219
Thread impares: 221
Thread impares: 223
Thread impares: 225
Thread impares: 227
Thread impares: 229
Thread impares: 231
Thread impares: 233
Thread impares: 235
Thread impares: 237
Thread impares: 239
Thread impares: 241
Thread impares: 243
Thread impares: 245
Thread impares: 247
Thread impares: 249
Thread impares: 251
Thread impares: 253
Thread impares: 255
Thread impares: 257
Thread impares: 259
Thread impares: 261
Thread impares: 263
Thread impares: 265
Thread impares: 267
Thread impares: 269
Thread impares: 271
Thread impares: 273
Thread impares: 275
Thread impares: 277
Thread impares: 279
Thread impares: 281
Thread impares: 283
Thread impares: 285
Thread impares: 287
Thread impares: 289
Thread impares: 291
Thread impares: 293
Thread impares: 295
Thread impares: 297
Thread impares: 299
Thread multiplos: 735
Thread multiplos: 742
Thread multiplos: 749
Thread multiplos: 756
Thread multiplos: 763
Thread multiplos: 770
Thread multiplos: 777
Thread multiplos: 784
Thread multiplos: 791
Thread multiplos: 798
Thread multiplos: 805
Thread multiplos: 812
Thread multiplos: 819
Thread multiplos: 826
Thread multiplos: 833
Thread multiplos: 840
Thread multiplos: 847
Thread multiplos: 854
Thread multiplos: 861
Thread multiplos: 868
Thread multiplos: 875
Thread multiplos: 882
Thread multiplos: 889
Thread multiplos: 896
Thread multiplos: 903
Thread multiplos: 910
Thread multiplos: 917
Thread multiplos: 924
Thread multiplos: 931
Thread multiplos: 938
Thread multiplos: 945
Thread multiplos: 952
Thread multiplos: 959
Thread multiplos: 966
Thread multiplos: 973
Thread multiplos: 980
Thread multiplos: 987
Thread multiplos: 994

Process finished with exit code 0
*/