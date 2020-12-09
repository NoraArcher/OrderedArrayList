# OrderedArrayList

## Progress
- [x] NoNullArrayList Constructors
- [x] NoNullArrayList [Methods](https://www.youtube.com/watch?v=l5aZJBLAu1E)
- [ ] NoNullArrayList Exceptions
- [x] OrderedArrayList Constructors
- [ ] OrderedArrayList Methods (set is untested)
- [x] OrderedArrayList Sorting
- [ ] OrderedArrayList Exceptions
- [ ] Thorough/Randomized Testing

## Breakout room discussion:
We discussed how to type into this README file.
Two hashtags will be header 2, two asterisks around a phrase puts it in italics, but 4 total is bold.
*NoNullArrayList* seems just like *ArrayList* but you replace a *NullPointerException* with an *IllegalArgumentException*.
We looked up *Comparable\<T\>* documentation because we weren't fully sure how we would be sorting and the method to use is *compareTo(T o)*

## Misconceptions:
I at first had no idea what you meant by using *startingCapacity* in the constructor.
We were somewhat confused about whether setting a *startingCapacity* would fill the *NoNullArrayList* will null values, but decided that it would only fill the private array inside the *ArrayList* class with nulls, not the *Arraylist* variable we were accessing.
There was also wondering whether we might use add index to accidentally include null values, but we believe *ArrayList* does not allow that.
I am definitely not throwing my exceptions right, it's going terribly. (Revision: the actual issue was having the wrong return types for my methods).
Wow I had the completely wrong approach, I had forgotten about super and I was using a private instance variable of the same class I was extending and oh my was that irrational. I did not realize this until I happened to look at @OliverSantiago -Kermani's commits.

## Alternate ideas from my group:
**no alternate ideas as of yet** :octocat:

## I just like to mess around with Markdown
![no fun, I can't get this image to work](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_2fK04BdwLjEd6LW1cIJD7L-TG9wYbk8i0g&usqp=CAU)
![what about this](https://www.australianwildlife.org/wp-content/uploads/2019/03/Northern-Brown-Bandicoot-%C2%A9-AWC.png)
