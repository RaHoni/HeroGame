# HeroGame

#Kampfablauf

Schaden solange bis einer Tot (abwechselnd)
- Held beginnt
- AttackDamage:
  - Warrior: strength * Waffenschaden * (ausdauer / levelunterschied !=0 ) * random(0.9-1,1) /Fester Wert
  - Magican: strength * Waffenschaden * ((magic + WeaponMagic) / levelunterschied !=0 ) * random(0.9-1,1) / Fester Wert
- ausdauer sinkt bei Angriff/Verteidigung

Held
- Stärke: Angriff (Verteidigung)
- Ausdauer: Max Leben
- Glück: Crit Chance
- Intelligenz: Verteidigung, (Angriff)
- Gesundheit: Nicht auf max. Leben begrenzt (Nur Heiler); Tränke
