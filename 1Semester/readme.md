# School Exam

# Relative Luftfeuchtigkeit
Du hast einen Mikrocontroller mit Sensoren so programmiert, dass er dir Temperatur und Wasserdampf liefert. Du willst sodann die relative Luftfeuchtigkeit errechnen. Zum testen schreibst du ein Programm, welches vom Nutzer die Daten

Temperatur in °C (nur positive Werte erlaubt)
Wasserdampf in kg (nur positive Werte erlaubt)
erfasst. Es soll darauf hin folgende Ausgaben erzeugen:

"Die relative Luftfeuchtigkeit beträgt x %", wobei für x die errechneten Prozent eingesetzt werden.

Danach gibt es Programm je nachdem, ob noch Wasserdampf aufgenommen werden kann oder nicht, folgendes aus:

"Luftfeuchtigkeit ist zu gering"
"Optimale Luftfeuchtigkeit" (40 - 60 %)
"Luftfeuchtigkeit ist zu hoch"
Halte dich dabei an folgende Werte (Wenn die Temperatur zwischen zwei Werten ist, nimmst du zur Sicherheit den unteren Temperaturwert an). Die angegebenen g Wasserdampf sind dann folglich die 100 %. Beispiel: Bei 23 °C hat die Luft bei 17 g volle 100 % Sättigung und bei 8,5 g hat sie 50 % Sättigung.

0°C --> 5 g Wasserdampf können aufgenommen werden
20°C --> 17g Wasserdampf können aufgenommen werden
30°C --> 30g Wasserdampf können aufgenommen werden

# Wasserdampfverlauf
Schreibe ein Programm, das erst erfragt, wie viele Wasserdampf Werte (in Prozent) eingegeben werden können. Im nächsten Schritt fragt es diese vom Nutzer ab.

Es erzeugt darauf hin eine Ausgabe mit:

Mittelwert
Höchstwert
Tiefstwert
Trend: wenn mehr direkt aufeinanderfolgende Anstiege
als Reduktionen gemessen werden, dann soll ausgegeben
werden: „Trend negativ“ ansonsten „Trend
positiv“. Bei gleich vielen Gewichtsanstiegen wie
Gewichtsreduktionen ist der „Trend neutral“.

# CAD Software
Schreiben sie ein CAD-Programm, das den Benutzer die Koordinaten eines rechtwinkeligen Dreiecks eingeben lässt. Du kannst davon ausgehen, dass die Seite a parallel zur x-Achse verläuft und die Seite b parallel zur y-Achse (2 Koordinaten reichen dafür, je mit X-Wert und Y-Wert, müssen positiv sein, Koordinatenursprung ist links unten 0,0). Das Programm soll nun die Fläche des Dreiecks berechnen und ausgeben, das durch die zwei zuvor eingegebenen Koordinatenwerte aufgespannt wird.


Sollte der Benutzer Koordinatenwerte eingeben, zu denen das aufgespannte Rechteck in der Höhe oder Breite 0 oder weniger ergibt, dann soll eine Fehlermeldung ausgegeben werden.
