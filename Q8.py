def left_rotate_array(arr, rotations):
    length = len(arr)
    rotations %= length  # Normalize rotations if it exceeds array length

    # Rotate the array elements using slicing
    rotated_arr = arr[rotations:] + arr[:rotations]

    return rotated_arr

# Example usage
array = [1, 2, 3, 4, 5]
rotations = 2

rotated_array = left_rotate_array(array, rotations)
print(rotated_array)
