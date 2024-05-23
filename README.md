# SI_2024_lab2_223211
Христијан Мијалески Спасески 223211

2.CFG
![Untitled Diagram drawio](https://github.com/HristijanMS/SI_2024_lab2_223211/assets/78322322/8b8805af-ac19-4292-ba77-0b74edf0db45)

3.Цикломатската комплексност
Формулата е C=E-N+2 и добицаме дека цикломатската комплексност е C=38-31+2 -> C=9

4.Every branch критериум

Прв тест
allitems =null, payment=random
Влегува во првиот if loop, фрла exception и одма излегува од програмата поради allitems=null.

Втор тест
allitems=[], payment=0
Нема да влезе во for loop(4) поради празна листа и ќе отиде на if loop(23) и врати true

Трет тест
allitems=[], payment=-1
Нема да влезе во for loop(4) поради празна листа и ќе отиде на if loop(23) и врати false

Четврт тест
AllItems[{name="",barcode=null,price"60",discount="0.6"}], payment=any
Во овој случај name=unknown и поради немањето на barcode ќе се фрли exception и ќе заврши програмата.

Петти тест 
AllItems[{name="",barcode="025607",price="2400",discount="0.5"}], payment=2
Ќе се даде name=unknown и програмата ќе си тече по ред и ќе врати true

Шести тест
AllItems[{name="Item1",barcode="02546",price"45",discount="-1"}], payment=any
Програмата ќе си тече по ред и ќе врати false поради discount ="-1"

![Capture](https://github.com/HristijanMS/SI_2024_lab2_223211/assets/78322322/497aba5f-671f-48f1-88be-0e66148f37f9)

5.Multiple Condition критериумот

Прв случај (TTT)

price =350 discount=0.4 barcode = 03324545

Сите се точни

Втор случај (FXX)

price = 300 discount=0.2 barcode = 2355466

Првото е false и другите не се битни.

Трет случај (TFX)

price = 30 discount=0 barcode = 2355466

Второто е грешно, а последното не е релевантно.

Четврт случак (TTF)

price = 302 discount=0.4 barcode = 2355466

Последното е грешно.

6.За Every Branch

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 12));
          assertTrue(ex.getMessage().contains("allItems list can't be null!"));
        

Влегува во првиот if loop, фрла exception и одма излегува од програмата поради allitems=null.



        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(createList(item2), 12));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

Во овој случај поради карактер во barcode ќе се фрли exception и ќе заврши програмата.

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(createList(item3), 12));
        assertTrue(ex.getMessage().contains("No barcode!"));
Во овој случај поради немањето barcode и име ќе се фрли exception и ќе заврши програмата.


        assertFalse(SILab2.checkCart(createList(item4), 11));
payment е помало и е false

        assertTrue(SILab2.checkCart(createList(item5), 11111));
payment e поголемо и е true

За Multiple Condition
TTT
assertFalse(SILab2.checkCart(createList(item4), 11));
FXX
assertFalse(SILab2.checkCart(createList(item5), 11));
TFX
assertFalse(SILab2.checkCart(createList(item6), 11));
TTF
assertFalse(SILab2.checkCart(createList(item7), 11));















