-- Adding two full names

UPDATE Users
SET FirstName = 'Elliot', LastName = 'Linnard'
WHERE Users.UserId = 3;

UPDATE Users
SET FirstName = 'Pam', LastName = 'Brogiottii'
WHERE Users.UserId = 19;

COMMIT;


-- Adding missing addresses
-- Zero options available, setting two SecretSanta choices from null to Y

UPDATE SantaAns
SET SecretSanta = 'y'
WHERE SantaAns.UserId = 1 OR SantaAns.UserId = 29;

UPDATE Addresses
SET Location = 'Plains Biome, Minecraft'
WHERE Addresses.UserId = 1;

UPDATE Addresses
SET Location = "Alfred's Virtual Machine"
WHERE Addresses.UserId = 29;

COMMIT;
