const num1 = prompt("Enter the First Integer:");
const num2 = prompt("Enter the Second Integer:");
for(let i=1;i<= num1 && i<= num2;i++)
{
    if( num1 % i==0 && num2 %i ==0)
    {
        gcd = i;
    }
}
console.log(`GCD 0f ${num1} and ${num2} is ${gcd}.`);
