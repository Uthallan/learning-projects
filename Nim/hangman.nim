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
var 
    dictionary = newSeq[string]()
    hiddenWord: string
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
proc chooseHiddenWord(): string =
    hiddenWord = dictionary[rand(dictionary.len-1)]
    return hiddenWord


proc drawHangedMan(guessesLeft: int): string =
    var 
        # 64 character long background pixel thingy
        canvasLine: string = "################################################################"
    proc createBlankCanvas(): 
    echo "                                              ############      "
    echo "                                                |       ##      "
    echo "                                                |       ##      "
    echo "                                               (_)      ##      "
    echo "                                                        ##      "
    echo "                                                        ##      "
    echo "                                                        ##      "
    echo "                                                        ##      "
    echo "                                            ################    "
    echo "                                            ##            ##    "
    echo "                                            ##            ##    "
    echo "################################################################"

######################################################
#                     MAIN                           #
######################################################

# Create Dictionary (no idea if this is memory efficient)
dictionary = createDictionary("D:\\BulkData\\wordList.txt")



hiddenWord = chooseHiddenWord()
echo hiddenWord

#echo drawHangedMan()