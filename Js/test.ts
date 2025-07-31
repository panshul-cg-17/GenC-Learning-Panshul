function greet(name: string): string {
    return `Hello, ${name}!`;
}

const message = greet("Alice");
console.log(message); // Output: Hello, Alice!

function calculateRectangleArea(width: number, height: number): number {
    return width * height;
}

const area = calculateRectangleArea(5, 10);
console.log("Area of rectangle:", area); // Output: Area of rectangle: 50