def counting_duplicates(string):
    map1 = {}
    for e in range(len(string)):

        if string[e] not in map1:
            map1 = (string[e], 1)
        else:
            value = map1.get(string[e])
            print("Value = " + value)
            value += 1
            map1 = (string[e], value)
        print(map1)
    return map1

if __name__ == "__main__":
    string = "DavidD"
    print(counting_duplicates(string))