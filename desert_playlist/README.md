# 🎵 Create Your Playlist: Java Arrays & ArrayLists

Welcome to your Java playlist-building project! In this activity, you’ll practice working with arrays and `ArrayList`s by building your own “desert island” playlist.

---

## ✅ Step-by-Step Instructions

### Step 1: Setup Your File
- Create a file named `Playlist.java`.
- Inside the file, define a public class called `Playlist`.
- Add a `main()` method to the `Playlist` class.
- Import the `Arrays` and `ArrayList` classes from `java.util`.

---

### Step 2: Favorite Songs Array
- Inside the `main()` method, create a `String[]` array named `favoriteSongs`.
- Initialize it with 10 of your favorite songs.
- Each song should be formatted as `"Artist - Song Title"`.

---

### Step 3: Print Top 3 Favorites
- Print the first three elements of the `favoriteSongs` array to the terminal.

---

### Step 4: Create a Desert Island Playlist
- Create an `ArrayList<String>` named `desertIslandPlaylist`.

---

### Step 5: Add Songs to Your Playlist
- Add 5 different songs to `desertIslandPlaylist`.
- Make sure these songs are **not** in your `favoriteSongs` array.
- Use the `add()` method to insert them.

---

### Step 6: Display Your Playlist
- Print the current contents of `desertIslandPlaylist` to the terminal.

---

## 🎶 Add and Remove Songs

### Step 7: Add Favorite Songs to Playlist
- Convert the `favoriteSongs` array into a list using `Arrays.asList()`.
- Use the `addAll()` method to add all songs from `favoriteSongs` to `desertIslandPlaylist`.

---

### Step 8: Check Playlist Size
- Use the `size()` method to print the number of songs currently in `desertIslandPlaylist`.

---

### Step 9: Trim Your Playlist
- Use the `remove()` method to delete songs from the playlist.
- Keep only your **top 5** favorite songs in the `desertIslandPlaylist`.

---

## 🔁 Swap Songs

### Step 10: Run Your Program
- Run the code and view the current state of your `desertIslandPlaylist`.

---

### Step 11: Choose Songs to Swap
- Choose two songs from the playlist.
- Use the `indexOf()` method to get their indices.
- Store the indices in two separate variables.

---

### Step 12: Create a Temporary Variable
- Create a `String` variable named `tempA`.
- Assign it the value of the first song you want to swap (Song A).

---

### Step 13: Swap First Song
- Use the `set()` method to replace Song A with Song B.
- Print the playlist — you should see Song B listed twice.

---

### Step 14: Complete the Swap
- Use the `set()` method again to place Song A back into the playlist using `tempA`.
- Print the playlist again — the songs should now be swapped.

---

## 🎧 Remix Ideas

### Step 15: Extend the Project
Congratulations! You’ve successfully created and manipulated your own playlist using Java. Here are some ideas for remixing or expanding this project:

- Create another playlist for your favorite food recipes, movies, or TV shows.
- Write a method to shuffle the playlist order.
- Reverse the playlist using a loop or Java’s built-in methods.

---

Happy coding and enjoy your personalized desert island playlist! 🎶
