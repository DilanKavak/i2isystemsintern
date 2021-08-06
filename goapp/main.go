package main

import (
	"bufio"
	"log"
	"os"
	"strconv"
	"strings"
)

func main() {

	file, error := os.Open("numberss.txt")
	if error != nil {
		log.Fatalf("failed to open")

	}

	fileLine, errorOne := os.Create("lineAvg.txt")
	if errorOne != nil {
		log.Fatal(errorOne)
	}

	fileSum, errorTwo := os.Create("sumAvg.txt")
	if errorTwo != nil {
		log.Fatal(errorTwo)
	}

	scanner := bufio.NewScanner(file)
	scanner.Split(bufio.ScanLines)
	var data []string

	for scanner.Scan() {
		data = append(data, scanner.Text())
	}

	file.Close()

	NumberAvg := 0
	NumberCount := 0
	for lineNum, eachLn := range data {

		arr := strings.Fields(eachLn)
		lineAvg := 0
		numberCountInLine := 0

		for _, number := range arr {
			numberCountInLine++
			i, _ := strconv.Atoi(number)
			lineAvg += i
			NumberCount++
		}
		NumberAvg += lineAvg
		lineAvg /= numberCountInLine

		if errorOne == nil && lineNum == 0 {
			fileLine.WriteString(strconv.Itoa(lineAvg))
		} else if errorOne == nil {
			fileLine.WriteString("\n" + strconv.Itoa(lineAvg))
		}
	}
	NumberAvg /= NumberCount
	if errorTwo == nil {
		fileSum.WriteString(strconv.Itoa(NumberAvg))
	}
	fileLine.Close()
	fileSum.Close()
}
