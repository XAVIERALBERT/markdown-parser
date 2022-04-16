# test 1 (same line) --- Works
[link2](some-thing.html) [link3](https://google.com)

# test 2 (an empty line between links) --- Works
[link2](some-thing.html)

[link3](https://google.com)

# test 3 (spaces at link) --- print two spaces
[link2]( some-thing.html )

# test 4 (image inference) --- Logic error: print out undesired message

![Image](Image inserted here)

[Link3][1]

[1]: (https://google.com)