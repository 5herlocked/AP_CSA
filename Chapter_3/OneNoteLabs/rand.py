import math

input_mass = 39.9639
output_mass = 39.9625
decay_mass = 0.0005485799

mass_diff = input_mass - output_mass - decay_mass

#mass to energy
final_energy = (mass_diff * 1.4924181*10**-10)
print (final_energy)

#energy to speed using kinetic energy
decay_mass_kg = decay_mass * 1.660539*10**-24
print(decay_mass_kg)

print(math.sqrt(2*final_energy/decay_mass_kg))