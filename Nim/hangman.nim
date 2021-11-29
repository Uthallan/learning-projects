import std/random
import strutils
randomize()

#[ Hangman Game todo:
    - set a max number of guesses
    - alert player of remaining guesses
    - read player input

]#   

######################################################
#                 Global Variables                   #
######################################################
var dictionary: seq[string] = @[]

######################################################
#                   PROCEDURES                       #
######################################################
proc createDictionary(filePath: string): seq[string] =
    var
        wordList: seq[string] = readFile(filePath).splitLines
        dictionary: seq[string] = @[]

    # Remove blank words and construct dictionary
    for i in 0..<wordList.len:
        if wordList[i] != "":
            dictionary.add(wordList[i])
    return dictionary



######################################################
#                     MAIN                           #
######################################################
dictionary = createDictionary("wordListSmall.txt")
echo dictionary[rand(dictionary.len-1)]