resource "aws_instance" "example" {
  ami           = "ami-0af9ac10a534a823b"  # Replace with your desired AMI ID
  instance_type = "t2.micro"      # Replace with your desired instance type

  tags = {
    Name = "MyEC2Instance"
  }
}