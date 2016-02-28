## Lab 08

### The Dynamically-Sized Garden Arrays of Martin and Pangloss

## Introduction

_“There is a concatenation of all events in the best of possible worlds; for, in short, had you not been kicked out of a fine castle for the love of Miss Cunegund; had you not been put into the Inquisition; had you not travelled over America on foot; had you not run the baron through the body; and had you not lost all your sheep, which you brought from the good country of El Dorado, you would not have been here to eat preserved citrons and pistachio nuts.” “Excellently observed,” answered Candide; “but let us take care of our garden.”_  
- Voltaire, _Candide_

In his story _Candide, or, Optimism_, Voltaire tells the tale of the childlike Candide, and his teacher, Professor Pangloss.  Pangloss believes that this is the best of all possible worlds, and all that happens is eventually for the best.  During their adventures, they meet up with the pessimistic Martin, who believes the world to be filled with fools and everything tends to work out for the worst.

At the end of the novel, they all work together on their gardens, which we will represent as arrays.  As you can imagine from their philosophies, they use different algorithms for resizing them once they fill up with rutabagas.  We will focus on the algorithms of Pangloss and Martin as they grow their rutabagas and resize their gardens to make room for more rutabagas.

## Setup

You may use the same private repo as used in the lab last week.  We will be creating one Java file, Lab07.java.  Remember to add, commit, and push to your repository!

## Lab 8

Martin and Pangloss each have a garden with five locations for rutabagas to grow.  Each season, anywhere from 0 to 4 rutabagas will grow (number to be picked at random each time).  Rutabagas start growing at location 0, then grow "upwards" into higher indexes (at each season, the old rutabagas stay in their old position).

For each season, fill in the spots where rutabagas were grown with the number of rutabagas grown that season.  For example, if 0 rutabagas were grown, then 0 locations would have a 0; if 1 rutabaga was grown, then 1 location would have a 1; if 2 rutabagas were grown, then 2 locations would have a 2, etc.  Asterisks indicate locations where no rutabaga has yet grown.

Example:
```
Garden:
[ ***, ***, ***, ***, ***]
Season: 1, 2 rutabaga(s)
[ 2, 2, ***, ***, ***]
Season: 2, 0 rutabaga(s)
[ 2, 2, ***, ***, ***]
Season: 3, 1 rutabaga(s)
[ 2, 2, 1, ***, ***]
```

Note that there should never be a 0 visible in the array.

Eventually, there will be more rutabagas than will fit in the garden.  At that point, the garden array will need to be resized (as we discussed in class).  The optimist Professor Pangloss always assumes that there will be many more rutabagas the next season, and so he will double the size of his garden.  The pessimist Martin assumes very few rutabagas will appear next season, and so he only increases the size of his garden array by 2.  Martin is so pessimistic that he will only increase the size of his garden by 2 even if there are more than 2 rutabagas that season!

You will simulate 40 seasons of rutabaga growing in Pangloss's and Martin's gardens.  During each resizing, indicate the new size of their gardens.  Note that there may be multiple resizings during a season!

Upon completion, you should display:

1. A graphical representation of Pangloss's and Martin's gardens.
2. The total size of their respective gardens (not the number of rutabagas, but the size that they have allocated for their gardens, i.e., the size of the array).
3. The number of times each garden was resized.

## Sample Output

Note: the following output is with only 10 seasons, but it should show you what the output should look like.

```
(635) $ javac Lab07.java ; java Lab07
Season: 1, 2 rutabaga(s)
Season: 2, 4 rutabaga(s)
Resized Martin's Garden to 7!
Resized Pangloss's Garden to 10!
Season: 3, 2 rutabaga(s)
Resized Martin's Garden to 9!
Season: 4, 3 rutabaga(s)
Resized Martin's Garden to 11!
Resized Pangloss's Garden to 20!
Resized Martin's Garden to 13!
Season: 5, 1 rutabaga(s)
Season: 6, 4 rutabaga(s)
Resized Martin's Garden to 15!
Resized Martin's Garden to 17!
Season: 7, 0 rutabaga(s)
Season: 8, 3 rutabaga(s)
Resized Martin's Garden to 19!
Resized Martin's Garden to 21!
Season: 9, 2 rutabaga(s)
Resized Pangloss's Garden to 40!
Resized Martin's Garden to 23!
Season: 10, 4 rutabaga(s)
Resized Martin's Garden to 25!
Resized Martin's Garden to 27!
[ 2, 2, 4, 4, 4, 4, 2, 2, 3, 3, 3, 1, 4, 4, 4, 4, 3, 3, 3, 2, 2, 4, 4, 4, 4, ***, *** ]
Martin Garden Size  : 27, Resized 11 times.
[ 2, 2, 4, 4, 4, 4, 2, 2, 3, 3, 3, 1, 4, 4, 4, 4, 3, 3, 3, 2, 2, 4, 4, 4, 4, ***, ***, ***, ***, ***, ***, ***, ***, ***, ***, ***, ***, ***, ***, *** ]
Pangloss Garden Size: 40, Resized 3 times.
```

## To Think About...

Remember that array resizing is an expensive operation.  However, doubling the size of the array means taking up much more room.

Are there certain cases when Pangloss's optimism makes more sense, or when Martin's pessimism makes more sense?

Software engineering is often a study of trade-offs; there is seldom one "right answer" to a problem.  The trade-off here is between CPU usage (lots of copying) and overall memory usage (from having large arrays with many locations allocated but not used).  Unthinking pessimism _or_ optimism can be a recipe for disaster, or at least suboptimal rutabaga storage.

## Tips

You may want to try the simulation with a smaller number of iterations, displaying the arrays at each season, in order to determine that your algorithms are correct.  After ensuring that your algorithms are correct, you can simply increase the number of iterations to 40.

For counting the number of times a resize occurred, perhaps a local variable is not the easiest way to keep track of the modifications?

Remember that array variables are references to the actual array in memory, and what this means when passing in references as an argument to a method.

You may want use this method for displaying the array, as well as for debugging:

```
    public static void printArray(int[] arr, int numItems) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    if (j >= numItems) {
		System.out.print("***, ");
	    } else {
		System.out.print(arr[j] + ", ");
	    }
	}
	
	if ((arr.length -1) >= numItems) {
	    System.out.println("*** ]");
	} else {
	    System.out.println(arr[arr.length - 1] + " ]");
	}
    }
```

You may also want to review how array resizing works, as shown in the ArrayCapacity.java file in the sample_code directory.

## Grading Rubric

1 point - Martin's and Pangloss's gardens resize correctly
1 point - The total size and number of resizes are displayed correctly