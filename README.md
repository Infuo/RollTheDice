# 🎲 Roll the Dice – App Android per il lancio virtuale di un dado

**Autore:** David Eboigbe  


**Roll the Dice** è un'applicazione Android sviluppata in **Kotlin**, pensata per simulare il lancio di un dado da sei facce. L'obiettivo è semplice: generare un numero casuale e determinare l'esito della partita in base al suo valore.

## 🔁 Meccanismo del gioco
L'app è strutturata su **tre schermate principali**:

### Avvio del gioco
L'utente vede due immagini di dadi e un pulsante. Premendo il pulsante, viene generato un numero da 1 a 6 e si passa alla schermata successiva.

### Visualizzazione del lancio
Il dado estratto viene mostrato con l’immagine corrispondente. Da qui si può accedere al risultato finale.

### Esito finale
Il numero viene valutato:
- Se **dispari**, l’utente **vince**
- Se **pari**, l’utente **perde**

## 🧱 Tecnologie usate
- **Linguaggio:** Kotlin
- **IDE:** Android Studio
- **UI:** XML Layout
- **Navigazione:** Intent Android

## 📦 Come provarla
1. Clona il progetto:
   ```bash
   git clone https://github.com/Infuo/RollTheDice.git
2. Apri il progetto in android studio
