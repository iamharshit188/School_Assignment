#!/bin/bash

# Step 1: Rename Java files based on their functionality

echo "Renaming Java files based on their functionality..."

# Simple file renaming logic using arrays (instead of associative arrays)
files_to_rename=("MyInheritance.java" "Special_Number.java" "PrimeAdam.java" "Spy_Number.java" "SwapSort.java" "Disarium.java" "Rev_Recur.java" "Twiseted_Prime.java" "TheString.java" "Fascinating.java" "Mixer.java" "DeleteWord.java" "Queue.java" "Rearrange.java" "Account.java" "Taxable.java" "Adder.java" "Find.java" "Book.java" "Revno.java" "HelloWorld.java" "Palin.java" "Goldbach.java" "MyInheritance_3.java" "ArmNum.java" "RevLoop.java" "NoRepeat.java" "Bank.java" "Unique.java" "Stack.java" "Item.java")
new_names=("CalculateTaxInheritance.java" "FindSpecialNumber.java" "FindPrimeAdamNumbers.java" "FindSpyNumber.java" "SwapAndSortWord.java" "FindDisariumNumber.java" "ReverseSentenceRecursively.java" "FindTwistedPrime.java" "AnalyzeStringWordsConsonants.java" "FindFascinatingNumbers.java" "MergeSortedArrays.java" "DeleteWordFromSentence.java" "QueueImplementation.java" "RearrangeWordVowelsConsonants.java" "ManageBankAccount.java" "CalculateTaxForItem.java" "AddTimeDurations.java" "FindNumberWithDigitSum.java" "ManageBookshelf.java" "ReverseNumber.java" "HelloWorld.java" "CheckPalindromeNumber.java" "FindGoldbachPrimePairs.java" "ManageAccountWithInheritance.java" "FindArmstrongNumber.java" "ReverseSentenceIteratively.java" "CheckUniqueCharacters.java" "BankDetails.java" "CheckWordStartsEndsWithVowel.java" "CharacterStackImplementation.java" "ItemDetails.java")

# Loop over files and rename them
for i in "${!files_to_rename[@]}"; do
    if [ -f "${files_to_rename[$i]}" ]; then
        mv "${files_to_rename[$i]}" "${new_names[$i]}"
        echo "Renamed '${files_to_rename[$i]}' to '${new_names[$i]}'"
    else
        echo "File '${files_to_rename[$i]}' not found. Skipping."
    fi
done

echo "Renaming complete."


# Step 2: Organize files into categories (Mathematics, StringManipulation, etc.)

echo "Organizing files into respective categories..."

# Define category mappings in a simple way
categories=("Mathematics" "StringManipulation" "DataStructures" "InheritanceAndTax" "GeneralUtilities")
category_files=("CalculateTaxInheritance.java FindSpecialNumber.java FindPrimeAdamNumbers.java FindDisariumNumber.java FindTwistedPrime.java FindFascinatingNumbers.java FindNumberWithDigitSum.java FindArmstrongNumber.java FindGoldbachPrimePairs.java"
"ReverseSentenceRecursively.java SwapAndSortWord.java ReverseSentenceIteratively.java AnalyzeStringWordsConsonants.java RearrangeWordVowelsConsonants.java DeleteWordFromSentence.java CheckPalindromeNumber.java CheckUniqueCharacters.java CheckWordStartsEndsWithVowel.java"
"QueueImplementation.java CharacterStackImplementation.java ManageBookshelf.java MergeSortedArrays.java"
"ManageBankAccount.java CalculateTaxForItem.java BankDetails.java ManageAccountWithInheritance.java"
"HelloWorld.java ReverseNumber.java AddTimeDurations.java ItemDetails.java")

# Create categories and move files into them
for i in "${!categories[@]}"; do
    mkdir -p "${categories[$i]}"
    for file in ${category_files[$i]}; do
        if [ -f "$file" ]; then
            mv "$file" "${categories[$i]}/"
            echo "Moved '$file' to '${categories[$i]}/'."
        else
            echo "File '$file' not found. Skipping."
        fi
    done
done

# Move remaining files to Uncategorized folder
mkdir -p Uncategorized
for file in *.java; do
    if [ -f "$file" ]; then
        mv "$file" "Uncategorized/"
        echo "Moved '$file' to 'Uncategorized'."
    fi
done

echo "File organization complete."


# Step 3: Automate Git commit history cleanup

echo "Starting Git rebase and commit history cleanup..."

# Ensure you're on the correct branch (default: master)
git checkout master

# Check for the correct number of commits (ensure we have at least 7)
commit_count=$(git rev-list --count HEAD)
if [ $commit_count -lt 7 ]; then
    echo "Not enough commits for rebase. Exiting..."
    exit 1
fi

# Start interactive rebase to modify commit messages
git rebase -i HEAD~7

# Automated commit message updates (for the first 7 commits)
declare -A commit_messages=(
    ["e4e2efb"]="Initial Commit: Add foundational structure and setup."
    ["be1add4"]="Add more solutions from ISC papers and remove obsolete files."
    ["68dbdbd"]="Add solutions to ISC papers (2020-2022)."
    ["9041a78"]="Add additional programs for ISC papers (2015-2022)."
    ["3b71b9c"]="Update README: Add project description and usage details."
    ["ba8a070"]="Organize file structure into categorized directories."
    ["84af355"]="Initial commit, set up the project structure."
)

# Continue the rebase and apply new commit messages
for commit_hash in "${!commit_messages[@]}"; do
    echo "Rewriting commit $commit_hash message to: ${commit_messages[$commit_hash]}"
    git commit --amend --no-edit --date "$(date)" --message "${commit_messages[$commit_hash]}"
done

# Finish rebase and force-push changes
git push --force origin master

echo "Git rebase and commit history cleanup complete."

echo "Project setup is now complete!"
