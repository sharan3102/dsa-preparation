def decimal_to_binary(decimal_num):
    binary_num = ""

    if decimal_num == 0:
        binary_num = "0"
    else:
        while decimal_num > 0:
            binary_num = str(decimal_num % 2) + binary_num
            decimal_num = decimal_num // 2

    return binary_num


# Example usage
decimal_number = 25
binary_number = decimal_to_binary(decimal_number)
print(binary_number)  # Output: 11001
